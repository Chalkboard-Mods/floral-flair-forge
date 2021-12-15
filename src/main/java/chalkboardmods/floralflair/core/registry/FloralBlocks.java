package chalkboardmods.floralflair.core.registry;

import chalkboardmods.floralflair.core.FloralFlair;
import com.teamabnormals.blueprint.common.block.BlueprintFlowerBlock;
import com.teamabnormals.blueprint.common.block.BlueprintTallFlowerBlock;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralBlocks {
    public static final BlockSubRegistryHelper HELPER = FloralFlair.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> FOXNIP = HELPER.createBlock("foxnip", () -> new BlueprintFlowerBlock(() -> MobEffects.MOVEMENT_SLOWDOWN, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> FROSTED_FOXNIP = HELPER.createBlock("frosted_foxnip", () -> new BlueprintFlowerBlock(() -> MobEffects.MOVEMENT_SLOWDOWN, 5, BlockBehaviour.Properties.copy(Blocks.POPPY)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PULSE_PETAL = HELPER.createBlock("pulse_petal", () -> new BlueprintFlowerBlock(() -> MobEffects.HEALTH_BOOST, 8, BlockBehaviour.Properties.copy(Blocks.POPPY)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> FAIRY_BLOSSOM = HELPER.createBlock("fairy_blossom", () -> new BlueprintTallFlowerBlock(Properties.TALL_FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> JUNGLE_GEM = HELPER.createBlock("gem_of_the_jungle", () -> new BlueprintFlowerBlock(() -> MobEffects.GLOWING, 10, BlockBehaviour.Properties.copy(Blocks.DANDELION)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> ROSE = HELPER.createBlock("rose", () -> new BlueprintFlowerBlock(()-> MobEffects.REGENERATION, 9, BlockBehaviour.Properties.copy(Blocks.POPPY)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> SUNSET_POPPY = HELPER.createBlock("sunset_poppy", () -> new BlueprintFlowerBlock(() -> MobEffects.FIRE_RESISTANCE, 11, BlockBehaviour.Properties.copy(Blocks.POPPY)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> MUSCARI = HELPER.createBlock("muscari", () -> new BlueprintTallFlowerBlock(Properties.TALL_FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PURPUREUM = HELPER.createBlock("purpureum", () -> new BlueprintTallFlowerBlock(Properties.TALL_FLOWER), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> POTTED_FOXNIP = HELPER.createBlockNoItem("potted_foxnip", () -> new FlowerPotBlock(FOXNIP.get(), Properties.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_FROSTED_FOXNIP = HELPER.createBlockNoItem("potted_frosted_foxnip", () -> new FlowerPotBlock(FROSTED_FOXNIP.get(), Properties.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_PULSE_PETAL = HELPER.createBlockNoItem("potted_pulse_petal", () -> new FlowerPotBlock(PULSE_PETAL.get(), Properties.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_JUNGLE_GEM = HELPER.createBlockNoItem("potted_gem_of_the_jungle", () -> new FlowerPotBlock(JUNGLE_GEM.get(), Properties.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_ROSE = HELPER.createBlockNoItem("potted_rose", () -> new FlowerPotBlock(ROSE.get(), Properties.FLOWER_POT));
    public static final RegistryObject<Block> POTTED_SUNSET_POPPY = HELPER.createBlockNoItem("potted_sunset_poppy", () -> new FlowerPotBlock(SUNSET_POPPY.get(), Properties.FLOWER_POT));



    public static class Properties {
        public static final BlockBehaviour.Properties FLOWER_POT = BlockBehaviour.Properties.of(Material.DECORATION).strength(0.0F).noOcclusion();
        public static final BlockBehaviour.Properties TALL_FLOWER = BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().strength(0.0f).sound(SoundType.GRASS);
    }
}
