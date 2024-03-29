package com.chalkboardmods.floral_flair.core;

import com.chalkboardmods.floral_flair.core.data.client.FloralBlockStateProvider;
import com.chalkboardmods.floral_flair.core.data.client.FloralItemModelProvider;
import com.chalkboardmods.floral_flair.core.data.client.FloralLanguageProvider;
import com.chalkboardmods.floral_flair.core.data.server.FloralDataPackRegistryProviders;
import com.chalkboardmods.floral_flair.core.data.server.FloralLootTableProvider;
import com.chalkboardmods.floral_flair.core.data.server.FloralRecipeProvider;
import com.chalkboardmods.floral_flair.core.data.server.tags.FloralBiomeTagsProvider;
import com.chalkboardmods.floral_flair.core.data.server.tags.FloralBlockTagsProvider;
import com.chalkboardmods.floral_flair.core.data.server.tags.FloralItemTagsProvider;
import com.chalkboardmods.floral_flair.core.other.FloralCompat;
import com.chalkboardmods.floral_flair.core.registry.FloralFeatures;
import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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
        RegistryAccess registryAccess = RegistryAccess.builtinCopy();
        RegistryOps<JsonElement> registryOps = RegistryOps.create(JsonOps.INSTANCE, registryAccess);

        FloralBlockTagsProvider blockTagsProvider = new FloralBlockTagsProvider(generator, fileHelper);

        generator.addProvider(event.includeServer(), new FloralLootTableProvider(generator));
        generator.addProvider(event.includeServer(), new FloralRecipeProvider(generator));
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new FloralItemTagsProvider(generator, blockTagsProvider, fileHelper));
        generator.addProvider(event.includeServer(), new FloralBiomeTagsProvider(generator, fileHelper));
        FloralDataPackRegistryProviders.registerDataPackProviders(generator, fileHelper, registryOps,event.includeServer());

        generator.addProvider(event.includeClient(), new FloralLanguageProvider(generator));
        generator.addProvider(event.includeClient(), new FloralBlockStateProvider(generator, fileHelper));
        generator.addProvider(event.includeClient(), new FloralItemModelProvider(generator, fileHelper));
    }

    public static class DataGenUtils {
        public static ResourceLocation modLocation (String name) {
            return new ResourceLocation(MOD_ID, name);
        }

        public static ResourceKey<ConfiguredFeature<?, ?>> configuredKey(ResourceLocation location) {
            return ResourceKey.create(Registry.CONFIGURED_FEATURE_REGISTRY, location);
        }

        public static ResourceKey<PlacedFeature> placedKey(ResourceLocation location) {
            return ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, location);
        }
    }
}