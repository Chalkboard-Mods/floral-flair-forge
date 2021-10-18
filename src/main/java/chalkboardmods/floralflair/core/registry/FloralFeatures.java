package chalkboardmods.floralflair.core.registry;

import chalkboardmods.floralflair.core.FloralFlair;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockplacer.DoublePlantBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralFeatures {


    public static final class Configs {
        public static final BlockClusterFeatureConfig FOXNIP_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(FloralBlocks.FOXNIP.get().defaultBlockState()),new SimpleBlockPlacer())).tries(32).build();
        public static final BlockClusterFeatureConfig FROSTED_FOXNIP_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(FloralBlocks.FROSTED_FOXNIP.get().defaultBlockState()),new SimpleBlockPlacer())).tries(32).build();
        public static final BlockClusterFeatureConfig PULSE_PETAL_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(FloralBlocks.PULSE_PETAL.get().defaultBlockState()),new SimpleBlockPlacer())).tries(32).build();
        public static final BlockClusterFeatureConfig FAIRY_BLOSSOM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(FloralBlocks.FAIRY_BLOSSOM.get().defaultBlockState()),new DoublePlantBlockPlacer())).tries(64).noProjection().build();
        public static final BlockClusterFeatureConfig WITHER_ROSE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.WITHER_ROSE.defaultBlockState()),new DoublePlantBlockPlacer())).tries(64).noProjection().build();


    }

    public static final class Configured {

        public static final ConfiguredFeature<?, ?> FLOWER_FOXNIP = register("flower_foxnip", Feature.FLOWER.configured(Configs.FOXNIP_CONFIG).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_SQUARE).count(3));
        public static final ConfiguredFeature<?, ?> FLOWER_FROSTED_FOXNIP = register("flower_frosted_foxnip", Feature.FLOWER.configured(Configs.FROSTED_FOXNIP_CONFIG).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_SQUARE).count(3));
        public static final ConfiguredFeature<?, ?> FLOWER_PULSE_PETAL = register("flower_pulse_petal", Feature.FLOWER.configured(Configs.PULSE_PETAL_CONFIG).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_SQUARE).count(3));
        public static final ConfiguredFeature<?, ?> FLOWER_FAIRY_BLOSSOM = register("flower_fairy_blossom", Feature.RANDOM_PATCH.configured(Configs.FAIRY_BLOSSOM_CONFIG).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(8));
        public static final ConfiguredFeature<?, ?> FLOWER_WITHER_ROSE = register("flower_wither_rose", Feature.FLOWER.configured(Configs.WITHER_ROSE_CONFIG).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_SQUARE).count(3));




        private static <FeatureConfig extends IFeatureConfig> ConfiguredFeature<FeatureConfig, ?> register(String name, ConfiguredFeature<FeatureConfig, ?> configuredFeature) {
            return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(FloralFlair.MOD_ID, name), configuredFeature);
        }
    }
}
