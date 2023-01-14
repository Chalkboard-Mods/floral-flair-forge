package com.chalkboardmods.floral_flair.core.event;

import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.chalkboardmods.floral_flair.core.registry.FloralFeatures;
import com.teamabnormals.blueprint.core.util.DataUtil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.xml.crypto.Data;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID)
public class FloralGeneration {

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        ResourceLocation biome = event.getName();
        BiomeGenerationSettingsBuilder generation = event.getGeneration();

        generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_STONETTE);

        if (event.getCategory() == Biome.BiomeCategory.TAIGA && !biome.toString().contains("snowy")) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_FOXNIP);
        } else if (event.getCategory() == Biome.BiomeCategory.TAIGA && biome.toString().contains("snowy")) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_FROSTED_FOXNIP);
        }

        if (event.getCategory() == Biome.BiomeCategory.FOREST) {
            if (DataUtil.matchesKeys(biome, Biomes.DARK_FOREST)) {
                generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_LUNULA);
            }
            if (DataUtil.matchesKeys(biome, Biomes.BIRCH_FOREST) || DataUtil.matchesKeys(biome, Biomes.OLD_GROWTH_BIRCH_FOREST)) {
                generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_PATCH_HYACINTH);
            }
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_PULSE_PETAL);
            if (DataUtil.matchesKeys(biome, Biomes.FLOWER_FOREST)) {
                generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_FAIRY_BLOSSOM);
            }
        }
        if (event.getCategory() == Biome.BiomeCategory.JUNGLE) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_JUNGLE_GEM);
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_SUNSET_ORCHID);
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_DAWN_ORCHID);
        }

        if (biome.toString().contains("snowy")) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_MUSCARI);
        }

        if (DataUtil.matchesKeys(biome, Biomes.MEADOW)) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_ROSE);
        }

        if (event.getCategory() == Biome.BiomeCategory.SWAMP) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_TWILIGHT_ORCHID);
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_MORNING_ORCHID);
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_PURPUREUM);
        }

        if (DataUtil.matchesKeys(biome, Biomes.GROVE)) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_SCILLA);
        }

        if (event.getCategory() == Biome.BiomeCategory.SAVANNA) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_ORANGE_COSMOS);
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_WHITE_COSMOS);
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_PINK_COSMOS);
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_CHOCOLATE_COSMOS);
        }

        if (DataUtil.matchesKeys(biome, Biomes.DRIPSTONE_CAVES)) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FLOWER_THORN_BLOSSOM);
        }
    }
}
