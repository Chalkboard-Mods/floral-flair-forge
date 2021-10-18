package chalkboardmods.floralflair.core.registry;

import chalkboardmods.floralflair.core.FloralFlair;
import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsFlowerBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsTallFlowerBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralBlocks {
    public static final BlockSubRegistryHelper HELPER = FloralFlair.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> FOXNIP = HELPER.createBlock("foxnip", () -> new AbnormalsFlowerBlock(() -> Effects.MOVEMENT_SLOWDOWN, 8, AbstractBlock.Properties.copy(Blocks.POPPY)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> FROSTED_FOXNIP = HELPER.createBlock("frosted_foxnip", () -> new AbnormalsFlowerBlock(() -> Effects.MOVEMENT_SLOWDOWN, 8, AbstractBlock.Properties.copy(Blocks.POPPY)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> PULSE_PETAL = HELPER.createBlock("pulse_petal", () -> new AbnormalsFlowerBlock(() -> Effects.REGENERATION, 8, AbstractBlock.Properties.copy(Blocks.POPPY)), ItemGroup.TAB_DECORATIONS);
    public static final RegistryObject<Block> FAIRY_BLOSSOM = HELPER.createBlock("fairy_blossom", () -> new AbnormalsTallFlowerBlock(Properties.FAIRY_BLOSSOM), ItemGroup.TAB_DECORATIONS);

    public static final RegistryObject<Block> POTTED_FOXNIP = HELPER.createBlockNoItem("potted_foxnip", () -> new FlowerPotBlock(FOXNIP.get(), Properties.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_FROSTED_FOXNIP = HELPER.createBlockNoItem("potted_frosted_foxnip", () -> new FlowerPotBlock(FROSTED_FOXNIP.get(), Properties.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_PULSE_PETAL = HELPER.createBlockNoItem("potted_pulse_petal", () -> new FlowerPotBlock(PULSE_PETAL.get(), Properties.FLOWER_POT));



    public static class Properties {
        public static final AbstractBlock.Properties FLOWER_POT = AbstractBlock.Properties.of(Material.DECORATION).strength(0.0F).noOcclusion();
        public static final AbstractBlock.Properties FAIRY_BLOSSOM = AbstractBlock.Properties.of(Material.REPLACEABLE_PLANT).noCollission().strength(0.0f).sound(SoundType.GRASS);
    }
}
