package chalkboardmods.floralflair.core.registry;

import chalkboardmods.floralflair.core.FloralConfig;
import chalkboardmods.floralflair.core.FloralFlair;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.Features;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.blockplacers.DoublePlantPlacer;
import net.minecraft.world.level.levelgen.feature.blockplacers.SimpleBlockPlacer;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralFeatures {


    public static final class Configs {
        public static final RandomPatchConfiguration FOXNIP_CONFIG = (new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(FloralBlocks.FOXNIP.get().defaultBlockState()),new SimpleBlockPlacer())).tries(32).build();
        public static final RandomPatchConfiguration FROSTED_FOXNIP_CONFIG = (new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(FloralBlocks.FROSTED_FOXNIP.get().defaultBlockState()),new SimpleBlockPlacer())).tries(32).build();
        public static final RandomPatchConfiguration PULSE_PETAL_CONFIG = (new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(FloralBlocks.PULSE_PETAL.get().defaultBlockState()),new SimpleBlockPlacer())).tries(32).build();
        public static final RandomPatchConfiguration FAIRY_BLOSSOM_CONFIG = (new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(FloralBlocks.FAIRY_BLOSSOM.get().defaultBlockState()),new DoublePlantPlacer())).tries(64).noProjection().build();
        public static final RandomPatchConfiguration JUNGLE_GEM_CONFIG = (new RandomPatchConfiguration.GrassConfigurationBuilder(new SimpleStateProvider(FloralBlocks.JUNGLE_GEM.get().defaultBlockState()),new SimpleBlockPlacer())).tries(32).build();


    }

    public static final class Configured {

        public static final ConfiguredFeature<?, ?> FLOWER_FOXNIP = register("flower_foxnip", Feature.FLOWER.configured(Configs.FOXNIP_CONFIG).decorated(Features.Decorators.ADD_32).decorated(Features.Decorators.HEIGHTMAP_SQUARE).count(FloralConfig.foxnipDensity.get()));
        public static final ConfiguredFeature<?, ?> FLOWER_FROSTED_FOXNIP = register("flower_frosted_foxnip", Feature.FLOWER.configured(Configs.FROSTED_FOXNIP_CONFIG).decorated(Features.Decorators.ADD_32).decorated(Features.Decorators.HEIGHTMAP_SQUARE).count(FloralConfig.foxnipDensity.get()));
        public static final ConfiguredFeature<?, ?> FLOWER_PULSE_PETAL = register("flower_pulse_petal", Feature.FLOWER.configured(Configs.PULSE_PETAL_CONFIG).decorated(Features.Decorators.ADD_32).decorated(Features.Decorators.HEIGHTMAP_SQUARE).count(FloralConfig.pulsePetalDensity.get()));
        public static final ConfiguredFeature<?, ?> FLOWER_FAIRY_BLOSSOM = register("flower_fairy_blossom", Feature.RANDOM_PATCH.configured(Configs.FAIRY_BLOSSOM_CONFIG).decorated(Features.Decorators.HEIGHTMAP_DOUBLE_SQUARE).count(FloralConfig.fairyBlossomDensity.get()));
        public static final ConfiguredFeature<?, ?> FLOWER_JUNGLE_GEM = register("flower_jungle_gem", Feature.FLOWER.configured(Configs.JUNGLE_GEM_CONFIG).decorated(Features.Decorators.ADD_32).decorated(Features.Decorators.HEIGHTMAP_SQUARE).count(FloralConfig.jungleGemDensity.get()));




        private static <FeatureConfig extends FeatureConfiguration> ConfiguredFeature<FeatureConfig, ?> register(String name, ConfiguredFeature<FeatureConfig, ?> configuredFeature) {
            return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(FloralFlair.MOD_ID, name), configuredFeature);
        }
    }
}
