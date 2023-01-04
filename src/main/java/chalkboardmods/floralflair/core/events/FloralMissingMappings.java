package chalkboardmods.floralflair.core.events;

import chalkboardmods.floralflair.core.FloralFlair;
import chalkboardmods.floralflair.core.registry.FloralBlocks;
import com.google.common.collect.ImmutableMap;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID)
public class FloralMissingMappings {

    @SubscribeEvent
    public static void onMissingMappings(RegistryEvent.MissingMappings<Block> event) {
        Map<ResourceLocation, Supplier<Block>> blocks = (new ImmutableMap.Builder<ResourceLocation, Supplier<Block>>())
                .put(new ResourceLocation(FloralFlair.MOD_ID, "anthurium"), FloralBlocks.PULSE_PETAL)
                .put(new ResourceLocation(FloralFlair.MOD_ID, "potted_anthurium"), FloralBlocks.POTTED_PULSE_PETAL)
                .put(new ResourceLocation(FloralFlair.MOD_ID, "sunset_poppy"), FloralBlocks.ORANGE_COSMOS)
                .put(new ResourceLocation(FloralFlair.MOD_ID, "potted_sunset_poppy"), FloralBlocks.POTTED_ORANGE_COSMOS)
                .put(new ResourceLocation(FloralFlair.MOD_ID, "snow_fall_flower"), FloralBlocks.WHITE_COSMOS)
                .put(new ResourceLocation(FloralFlair.MOD_ID, "potted_snow_fall_flower"), FloralBlocks.WHITE_COSMOS)
                .put(new ResourceLocation(FloralFlair.MOD_ID, "stonnete"), FloralBlocks.STONETTE)
                .put(new ResourceLocation(FloralFlair.MOD_ID, "potted_stonnete"), FloralBlocks.POTTED_STONETTE)
                .build();

        for (RegistryEvent.MissingMappings.Mapping<Block> mapping : event.getAllMappings()) {
            Supplier<Block> blockSupplier = blocks.get(mapping.key);
            if (blockSupplier != null) {
                Block block = blockSupplier.get();
                if (block.getRegistryName() != null) {
                    mapping.remap(block);
                }
            }
        }
    }
}
