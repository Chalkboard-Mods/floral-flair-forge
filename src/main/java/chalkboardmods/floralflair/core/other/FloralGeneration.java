package chalkboardmods.floralflair.core.other;

import chalkboardmods.floralflair.core.FloralConfig;
import chalkboardmods.floralflair.core.FloralFlair;
import chalkboardmods.floralflair.core.registry.FloralFeatures;
import com.teamabnormals.blueprint.core.util.DataUtil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID)
public class FloralGeneration {

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        ResourceLocation biome = event.getName();
        BiomeGenerationSettingsBuilder generation = event.getGeneration();

        if (event.getCategory() == Biome.BiomeCategory.TAIGA && !biome.toString().contains("snowy") && FloralConfig.foxnipDensity.get() != 0) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FOXNIP_PLACED);
        } else if (event.getCategory() == Biome.BiomeCategory.TAIGA && biome.toString().contains("snowy") && FloralConfig.foxnipDensity.get() != 0) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FROSTED_FOXNIP_PLACED);}
        if (event.getCategory() == Biome.BiomeCategory.FOREST) {
            if (FloralConfig.pulsePetalDensity.get() != 0) {
                generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.PULSE_PLACED);
            }
            if (DataUtil.matchesKeys(biome, Biomes.FLOWER_FOREST) && FloralConfig.fairyBlossomDensity.get() != 0) {
                generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FAIRY_BLOSSOM_PLACED);
            }
        }
        if (event.getCategory() == Biome.BiomeCategory.JUNGLE && FloralConfig.jungleGemDensity.get() != 0) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.JUNGLE_GEM_PLACED);
        }

        if (biome.toString().contains("snowy") && FloralConfig.muscariDensity.get() != 0) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.MUSCARI_PLACED);
        }

        if (DataUtil.matchesKeys(biome, Biomes.SUNFLOWER_PLAINS) && FloralConfig.sunsetPoppyDensity.get() != 0) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.SUNSET_POPPY_PLACED);
        }

        if ((event.getCategory() == Biome.BiomeCategory.FOREST || event.getCategory() == Biome.BiomeCategory.PLAINS) && FloralConfig.roseDensity.get() != 0) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.ROSE_PLACED);
        }
    }
}
