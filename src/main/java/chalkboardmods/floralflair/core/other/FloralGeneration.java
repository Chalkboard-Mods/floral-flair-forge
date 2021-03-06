package chalkboardmods.floralflair.core.other;

import chalkboardmods.floralflair.core.FloralFlair;
import chalkboardmods.floralflair.core.registry.FloralFeatures;
import com.teamabnormals.blueprint.core.util.DataUtil;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
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

        generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.STONNETE_PLACED);

        if (event.getCategory() == Biome.BiomeCategory.TAIGA && !biome.toString().contains("snowy")) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FOXNIP_PLACED);
        } else if (event.getCategory() == Biome.BiomeCategory.TAIGA && biome.toString().contains("snowy")) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FROSTED_FOXNIP_PLACED);
        }
        if (event.getCategory() == Biome.BiomeCategory.FOREST) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.PULSE_PLACED);
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.ANTHURIUM_PLACED);
            if (DataUtil.matchesKeys(biome, Biomes.FLOWER_FOREST)) {
                generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.FAIRY_BLOSSOM_PLACED);
                generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.HYACINTH_PLACED);
            }
        }
        if (event.getCategory() == Biome.BiomeCategory.JUNGLE) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.JUNGLE_GEM_PLACED);
        }

        if (biome.toString().contains("snowy")) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.MUSCARI_PLACED);
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.SNOWFALL_FLOWER_PLACED);
        }

        if (event.getCategory() == Biome.BiomeCategory.SAVANNA) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.SUNSET_POPPY_PLACED);
        }

        if (DataUtil.matchesKeys(biome, Biomes.DRIPSTONE_CAVES)) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.SPIKED_TULIP_PLACED);
        }

        if (DataUtil.matchesKeys(biome, Biomes.MEADOW)) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.ROSE_PLACED);
        }

        if (event.getCategory() == Biome.BiomeCategory.SWAMP) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.MIDNIGHT_ORCHID_PLACED);
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.PURPUREUM_PLACED);
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.LUNULA_PLACED);
        }

        if (DataUtil.matchesKeys(biome, Biomes.GROVE)) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Placed.SCILLA_PLACED);
        }
    }
}
