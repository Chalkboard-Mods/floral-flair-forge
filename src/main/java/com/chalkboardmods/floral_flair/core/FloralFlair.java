package com.chalkboardmods.floral_flair.core;

import com.chalkboardmods.floral_flair.core.data.client.FloralBlockStateProvider;
import com.chalkboardmods.floral_flair.core.data.client.FloralItemModelProvider;
import com.chalkboardmods.floral_flair.core.data.client.FloralLanguageProvider;
import com.chalkboardmods.floral_flair.core.data.server.FloralLootTableProvider;
import com.chalkboardmods.floral_flair.core.data.server.FloralRecipeProvider;
import com.chalkboardmods.floral_flair.core.data.server.tags.FloralBlockTagsProvider;
import com.chalkboardmods.floral_flair.core.data.server.tags.FloralItemTagsProvider;
import com.chalkboardmods.floral_flair.core.other.FloralCompat;
import com.chalkboardmods.floral_flair.core.registry.FloralFeatures;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(FloralFlair.MOD_ID)
@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralFlair {
    public static final String MOD_ID = "floral_flair";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);

    public FloralFlair() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        REGISTRY_HELPER.register(bus);
        FloralFeatures.Features.FEATURES.register(bus);

        bus.addListener(this::compatRegister);
        bus.addListener(this::gatherData);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void compatRegister(FMLCommonSetupEvent event) {
        event.enqueueWork(FloralCompat::compatList);
    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        FloralBlockTagsProvider blockTagsProvider = new FloralBlockTagsProvider(generator, fileHelper);

        if (event.includeServer()) {
            generator.addProvider(new FloralLootTableProvider(generator));
            generator.addProvider(new FloralRecipeProvider(generator));
            generator.addProvider(blockTagsProvider);
            generator.addProvider(new FloralItemTagsProvider(generator, blockTagsProvider,fileHelper));
        }

        if (event.includeClient()) {
            generator.addProvider(new FloralLanguageProvider(generator));
            generator.addProvider(new FloralBlockStateProvider(generator, fileHelper));
            generator.addProvider(new FloralItemModelProvider(generator, fileHelper));
        }
    }
}