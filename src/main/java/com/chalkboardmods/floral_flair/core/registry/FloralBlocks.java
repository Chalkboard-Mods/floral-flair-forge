package com.chalkboardmods.floral_flair.core.registry;

import com.chalkboardmods.floral_flair.common.FloralProperties;
import com.chalkboardmods.floral_flair.common.block.*;
import com.chalkboardmods.floral_flair.core.FloralFlair;
import com.teamabnormals.blueprint.core.util.PropertyUtil;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;

@Mod.EventBusSubscriber(modid = FloralFlair.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralBlocks {
    private static ToIntFunction<BlockState> createLightLevelFromTimeBlockState(int litLevel) {
        return (state) -> state.getValue(FloralProperties.TIME) == 3 ? litLevel : 0;
    }

    //Flowers
    public static final BlockSubRegistryHelper HELPER = FloralFlair.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> FOXNIP = HELPER.createBlock("foxnip", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SLOWDOWN, 8, PropertyUtil.flower()));
    public static final RegistryObject<Block> FROSTED_FOXNIP = HELPER.createBlock("frosted_foxnip", () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SLOWDOWN, 5, PropertyUtil.flower()));
    public static final RegistryObject<Block> PULSE_PETAL = HELPER.createBlock("pulse_petal", () -> new FlowerBlock(() -> MobEffects.HEALTH_BOOST, 8, PropertyUtil.flower()));
    public static final RegistryObject<Block> FAIRY_BLOSSOM = HELPER.createBlock("fairy_blossom", () -> new TallFlowerBlock(PropertyUtil.flower()));
    public static final RegistryObject<Block> JUNGLE_GEM = HELPER.createBlock("gem_of_the_jungle", () -> new FlowerBlock(() -> MobEffects.GLOWING, 10, PropertyUtil.flower()));
    public static final RegistryObject<Block> ROSE = HELPER.createBlock("rose", () -> new FlowerBlock(() -> MobEffects.REGENERATION, 9, PropertyUtil.flower()));
    public static final RegistryObject<Block> MUSCARI = HELPER.createBlock("muscari", () -> new FlowerBlock(() -> MobEffects.HUNGER, 8, PropertyUtil.flower()));
    public static final RegistryObject<Block> PURPUREUM = HELPER.createBlock("purpureum", () -> new TallFlowerBlock(PropertyUtil.flower()));
    public static final RegistryObject<Block> SCILLA = HELPER.createBlock("scilla", () -> new ScillaFlowerBlock(() -> MobEffects.WEAKNESS, 6, PropertyUtil.flower()));
    public static final RegistryObject<Block> TWILIGHT_ORCHID = HELPER.createBlock("twilight_orchid", () -> new FlowerBlock(() -> MobEffects.NIGHT_VISION, 4, PropertyUtil.flower()));
    public static final RegistryObject<Block> SUNSET_ORCHID = HELPER.createBlock("sunset_orchid", () -> new FlowerBlock(() -> MobEffects.ABSORPTION, 3, PropertyUtil.flower()));
    public static final RegistryObject<Block> MORNING_ORCHID = HELPER.createBlock("morning_orchid", () -> new FlowerBlock(() -> MobEffects.CONFUSION, 5, PropertyUtil.flower()));
    public static final RegistryObject<Block> DAWN_ORCHID = HELPER.createBlock("dawn_orchid", () -> new FlowerBlock(() -> MobEffects.DAMAGE_RESISTANCE, 6, PropertyUtil.flower()));
    public static final RegistryObject<Block> PINK_HYACINTH = HELPER.createBlock("pink_hyacinth", () -> new FlowerBlock(() -> MobEffects.DIG_SLOWDOWN, 5, PropertyUtil.flower()));
    public static final RegistryObject<Block> BLUE_HYACINTH = HELPER.createBlock("blue_hyacinth", () -> new FlowerBlock(() -> MobEffects.WATER_BREATHING, 5, PropertyUtil.flower()));
    public static final RegistryObject<Block> YELLOW_HYACINTH = HELPER.createBlock("yellow_hyacinth", () -> new FlowerBlock(() -> MobEffects.SATURATION, 2, PropertyUtil.flower()));
    public static final RegistryObject<Block> BLACK_HYACINTH = HELPER.createBlock("black_hyacinth", () -> new FlowerBlock(() -> MobEffects.BLINDNESS, 5, PropertyUtil.flower()));
    public static final RegistryObject<Block> THORN_BLOSSOM = HELPER.createBlock("thorn_blossom", () -> new ThornBlossomBlock(PropertyUtil.flower()));
    public static final RegistryObject<Block> STONETTE = HELPER.createBlock("stonette", () -> new StonetteBlock(() -> MobEffects.DIG_SPEED, 6, PropertyUtil.flower().sound(SoundType.AMETHYST_CLUSTER)));
    public static final RegistryObject<Block> LUNULA = HELPER.createBlock("lunula", () -> new LunulaBlock(() -> MobEffects.GLOWING, 10, Properties.LUNULA));
    public static final RegistryObject<Block> ORANGE_COSMOS = HELPER.createBlock("orange_cosmos", () -> new FlowerBlock(() -> MobEffects.FIRE_RESISTANCE, 9, PropertyUtil.flower()));
    public static final RegistryObject<Block> WHITE_COSMOS = HELPER.createBlock("white_cosmos", () -> new FlowerBlock(() -> MobEffects.SLOW_FALLING, 7, PropertyUtil.flower()));
    public static final RegistryObject<Block> PINK_COSMOS = HELPER.createBlock("pink_cosmos", () -> new FlowerBlock(() -> MobEffects.INVISIBILITY, 4, PropertyUtil.flower()));
    public static final RegistryObject<Block> CHOCOLATE_COSMOS = HELPER.createBlock("chocolate_cosmos", () -> new FlowerBlock(() -> MobEffects.NIGHT_VISION, 12, PropertyUtil.flower()));


    //Potted Flowers
    public static final RegistryObject<Block> POTTED_FOXNIP = HELPER.createBlockNoItem("potted_foxnip", () -> new FlowerPotBlock(FOXNIP.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_FROSTED_FOXNIP = HELPER.createBlockNoItem("potted_frosted_foxnip", () -> new FlowerPotBlock(FROSTED_FOXNIP.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_PULSE_PETAL = HELPER.createBlockNoItem("potted_pulse_petal", () -> new FlowerPotBlock(PULSE_PETAL.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_JUNGLE_GEM = HELPER.createBlockNoItem("potted_gem_of_the_jungle", () -> new FlowerPotBlock(JUNGLE_GEM.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_ROSE = HELPER.createBlockNoItem("potted_rose", () -> new FlowerPotBlock(ROSE.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_SCILLA = HELPER.createBlockNoItem("potted_scilla", () -> new FlowerPotBlock(SCILLA.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_TWILIGHT_ORCHID = HELPER.createBlockNoItem("potted_twilight_orchid", () -> new FlowerPotBlock(TWILIGHT_ORCHID.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_SUNSET_ORCHID = HELPER.createBlockNoItem("potted_sunset_orchid", () -> new FlowerPotBlock(SUNSET_ORCHID.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_MORNING_ORCHID = HELPER.createBlockNoItem("potted_morning_orchid", () -> new FlowerPotBlock(MORNING_ORCHID.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_DAWN_ORCHID = HELPER.createBlockNoItem("potted_dawn_orchid", () -> new FlowerPotBlock(DAWN_ORCHID.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_PINK_HYACINTH = HELPER.createBlockNoItem("potted_pink_hyacinth", () -> new FlowerPotBlock(PINK_HYACINTH.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_BLUE_HYACINTH = HELPER.createBlockNoItem("potted_blue_hyacinth", () -> new FlowerPotBlock(BLUE_HYACINTH.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_YELLOW_HYACINTH = HELPER.createBlockNoItem("potted_yellow_hyacinth", () -> new FlowerPotBlock(YELLOW_HYACINTH.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_BLACK_HYACINTH = HELPER.createBlockNoItem("potted_black_hyacinth", () -> new FlowerPotBlock(BLACK_HYACINTH.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_STONETTE = HELPER.createBlockNoItem("potted_stonette", () -> new FlowerPotBlock(STONETTE.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_LUNULA = HELPER.createBlockNoItem("potted_lunula", () -> new PottedLunulaBlock(LUNULA.get(), Properties.POTTED_LUNULA));
    public static final RegistryObject<Block> POTTED_ORANGE_COSMOS = HELPER.createBlockNoItem("potted_orange_cosmos", () -> new FlowerPotBlock(ORANGE_COSMOS.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_WHITE_COSMOS = HELPER.createBlockNoItem("potted_white_cosmos", () -> new FlowerPotBlock(WHITE_COSMOS.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_PINK_COSMOS = HELPER.createBlockNoItem("potted_pink_cosmos", () -> new FlowerPotBlock(PINK_COSMOS.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_CHOCOLATE_COSMOS = HELPER.createBlockNoItem("potted_chocolate_cosmos", () -> new FlowerPotBlock(CHOCOLATE_COSMOS.get(), PropertyUtil.flowerPot()));
    public static final RegistryObject<Block> POTTED_MUSCARI = HELPER.createBlockNoItem("potted_muscari", () -> new FlowerPotBlock(MUSCARI.get(), PropertyUtil.flowerPot()));

    public static class Properties {
        public static final BlockBehaviour.Properties LUNULA = BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).lightLevel(createLightLevelFromTimeBlockState(5)).offsetType(BlockBehaviour.OffsetType.XZ);
        public static final BlockBehaviour.Properties POTTED_LUNULA = BlockBehaviour.Properties.of().instabreak().noOcclusion().lightLevel(createLightLevelFromTimeBlockState(5));
    }
}
