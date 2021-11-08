package chalkboardmods.floralflair.core.other;

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

        if (event.getCategory() == Biome.BiomeCategory.TAIGA && !biome.toString().contains("snowy")) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Configured.FLOWER_FOXNIP);
        } else if (event.getCategory() == Biome.BiomeCategory.TAIGA && biome.toString().contains("snowy")) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Configured.FLOWER_FROSTED_FOXNIP);
        } else if (event.getCategory() == Biome.BiomeCategory.FOREST) {
            generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Configured.FLOWER_PULSE_PETAL);
            if (DataUtil.matchesKeys(biome, Biomes.FLOWER_FOREST)) {
                generation.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FloralFeatures.Configured.FLOWER_FAIRY_BLOSSOM);
            }
        }
    }
}
