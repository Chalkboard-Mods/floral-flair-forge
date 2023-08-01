package com.chalkboardmods.floral_flair.core.registry;

import com.chalkboardmods.floral_flair.common.feature.ThornBlossomFeature;
import com.chalkboardmods.floral_flair.core.FloralFlair;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralFeatures {

    public static final class Features {
        public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, FloralFlair.MOD_ID);

        public static final RegistryObject<Feature<SimpleBlockConfiguration>> THORN_BLOSSOM_FEATURE = FEATURES.register("thorn_blossom", () -> new ThornBlossomFeature(SimpleBlockConfiguration.CODEC));
    }
}
