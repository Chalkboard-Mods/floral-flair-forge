package com.chalkboardmods.floral_flair.core;

import com.chalkboardmods.floral_flair.core.data.client.FloralBlockStateProvider;
import com.chalkboardmods.floral_flair.core.data.client.FloralItemModelProvider;
import com.chalkboardmods.floral_flair.core.data.client.FloralLanguageProvider;
import com.chalkboardmods.floral_flair.core.data.server.FloralDatapackBuiltinEntriesProvider;
import com.chalkboardmods.floral_flair.core.data.server.FloralLootTableProvider;
import com.chalkboardmods.floral_flair.core.data.server.FloralRecipeProvider;
import com.chalkboardmods.floral_flair.core.data.server.tags.FloralBiomeTagsProvider;
import com.chalkboardmods.floral_flair.core.data.server.tags.FloralBlockTagsProvider;
import com.chalkboardmods.floral_flair.core.data.server.tags.FloralItemTagsProvider;
import com.chalkboardmods.floral_flair.core.other.FloralCompat;
import com.chalkboardmods.floral_flair.core.registry.FloralFeatures;
import com.chalkboardmods.floral_flair.core.registry.FloralItems;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;

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

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> FloralItems::setupTabEditors);

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
        CompletableFuture<HolderLookup.Provider> lookup = event.getLookupProvider();

        FloralBlockTagsProvider blockTagsProvider = new FloralBlockTagsProvider(generator.getPackOutput(), lookup, fileHelper);

        generator.addProvider(event.includeServer(), new FloralLootTableProvider(generator.getPackOutput()));
        generator.addProvider(event.includeServer(), new FloralRecipeProvider(generator.getPackOutput()));
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new FloralItemTagsProvider(generator.getPackOutput(), lookup, blockTagsProvider.contentsGetter(), fileHelper));
        generator.addProvider(event.includeServer(), new FloralBiomeTagsProvider(generator.getPackOutput(), lookup, fileHelper));
        generator.addProvider(event.includeServer(), new FloralDatapackBuiltinEntriesProvider(generator.getPackOutput(), lookup));

        generator.addProvider(event.includeClient(), new FloralLanguageProvider(generator.getPackOutput()));
        generator.addProvider(event.includeClient(), new FloralBlockStateProvider(generator.getPackOutput(), fileHelper));
        generator.addProvider(event.includeClient(), new FloralItemModelProvider(generator.getPackOutput(), fileHelper));
    }

    public static class DataGenUtils {
        public static ResourceLocation modLocation (String name) {
            return new ResourceLocation(MOD_ID, name);
        }

        public static ResourceKey<ConfiguredFeature<?, ?>> configuredKey(ResourceLocation location) {
            return ResourceKey.create(Registries.CONFIGURED_FEATURE, location);
        }

        public static ResourceKey<PlacedFeature> placedKey(ResourceLocation location) {
            return ResourceKey.create(Registries.PLACED_FEATURE, location);
        }

        public static ResourceKey<BiomeModifier> modifierKey(ResourceLocation location) {
            return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, location);
        }
    }
}