package com.chalkboardmods.floral_flair.core.data.server;

import com.chalkboardmods.floral_flair.core.registry.FloralBlocks;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FloralLootTableProvider extends LootTableProvider {
    public FloralLootTableProvider(DataGenerator generator) {
        super(generator);
    }

    private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> lootTables = ImmutableList.of(Pair.of(FloralBlockLoot::new, LootContextParamSets.BLOCK));

    @Override
    protected @NotNull List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return this.lootTables;
    }

    @Override
    protected void validate(@NotNull Map<ResourceLocation, LootTable> map, @NotNull ValidationContext validationtracker) {
    }

    public static class FloralBlockLoot extends BlockLoot {

        @Override
        protected void addTables() {
            this.dropSelf(FloralBlocks.FOXNIP.get());
            this.dropSelf(FloralBlocks.FROSTED_FOXNIP.get());
            this.dropSelf(FloralBlocks.PULSE_PETAL.get());
            this.add(FloralBlocks.FAIRY_BLOSSOM.get(), (block) -> createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
            this.dropSelf(FloralBlocks.JUNGLE_GEM.get());
            this.dropSelf(FloralBlocks.ROSE.get());
            this.dropSelf(FloralBlocks.MUSCARI.get());
            this.add(FloralBlocks.PURPUREUM.get(), (block) -> createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
            this.add(FloralBlocks.THORN_BLOSSOM.get(), (block) -> createSinglePropConditionTable(block, BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER));
            this.dropSelf(FloralBlocks.SCILLA.get());
            this.dropSelf(FloralBlocks.TWILIGHT_ORCHID.get());
            this.dropSelf(FloralBlocks.SUNSET_ORCHID.get());
            this.dropSelf(FloralBlocks.MORNING_ORCHID.get());
            this.dropSelf(FloralBlocks.DAWN_ORCHID.get());
            this.dropSelf(FloralBlocks.PINK_HYACINTH.get());
            this.dropSelf(FloralBlocks.BLUE_HYACINTH.get());
            this.dropSelf(FloralBlocks.YELLOW_HYACINTH.get());
            this.dropSelf(FloralBlocks.BLACK_HYACINTH.get());
            this.dropSelf(FloralBlocks.STONETTE.get());
            this.dropSelf(FloralBlocks.ORANGE_COSMOS.get());
            this.dropSelf(FloralBlocks.WHITE_COSMOS.get());
            this.dropSelf(FloralBlocks.PINK_COSMOS.get());
            this.dropSelf(FloralBlocks.CHOCOLATE_COSMOS.get());
            this.dropSelf(FloralBlocks.LUNULA.get());

            this.dropPottedContents(FloralBlocks.POTTED_FOXNIP.get());
            this.dropPottedContents(FloralBlocks.POTTED_FROSTED_FOXNIP.get());
            this.dropPottedContents(FloralBlocks.POTTED_PULSE_PETAL.get());
            this.dropPottedContents(FloralBlocks.POTTED_JUNGLE_GEM.get());
            this.dropPottedContents(FloralBlocks.POTTED_ROSE.get());
            this.dropPottedContents(FloralBlocks.POTTED_SCILLA.get());
            this.dropPottedContents(FloralBlocks.POTTED_TWILIGHT_ORCHID.get());
            this.dropPottedContents(FloralBlocks.POTTED_SUNSET_ORCHID.get());
            this.dropPottedContents(FloralBlocks.POTTED_MORNING_ORCHID.get());
            this.dropPottedContents(FloralBlocks.POTTED_DAWN_ORCHID.get());
            this.dropPottedContents(FloralBlocks.POTTED_PINK_HYACINTH.get());
            this.dropPottedContents(FloralBlocks.POTTED_BLUE_HYACINTH.get());
            this.dropPottedContents(FloralBlocks.POTTED_YELLOW_HYACINTH.get());
            this.dropPottedContents(FloralBlocks.POTTED_BLACK_HYACINTH.get());
            this.dropPottedContents(FloralBlocks.POTTED_STONETTE.get());
            this.dropPottedContents(FloralBlocks.POTTED_ORANGE_COSMOS.get());
            this.dropPottedContents(FloralBlocks.POTTED_WHITE_COSMOS.get());
            this.dropPottedContents(FloralBlocks.POTTED_PINK_COSMOS.get());
            this.dropPottedContents(FloralBlocks.POTTED_CHOCOLATE_COSMOS.get());
            this.dropPottedContents(FloralBlocks.POTTED_LUNULA.get());
            this.dropPottedContents(FloralBlocks.POTTED_MUSCARI.get());
        }

        @Override
        protected @NotNull Iterable<Block> getKnownBlocks() {
            return FloralBlocks.HELPER.getDeferredRegister().getEntries().stream().map(RegistryObject::get)::iterator;
        }
    }
}
