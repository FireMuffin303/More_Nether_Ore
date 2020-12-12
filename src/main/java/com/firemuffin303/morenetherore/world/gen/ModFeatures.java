package com.firemuffin303.morenetherore.world.gen;

import com.firemuffin303.morenetherore.core.MoreNetherOre;
import com.firemuffin303.morenetherore.init.BlocksRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.fml.common.Mod;

public class ModFeatures {
    public static final ConfiguredFeature<?, ?> ORE_IRON_NETHER = register("ore_iron_nether", Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModFeatures.ModStates.NETHER_IRON_ORE, 5)).withPlacement(Features.Placements.NETHER_SPRING_ORE_PLACEMENT).square().func_242731_b(6));
    public static final ConfiguredFeature<?, ?> ORE_DIAMOND_NETHER_SMALL = register("ore_diamond_nether_small", Feature.NO_SURFACE_ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, ModFeatures.ModStates.NETHER_DIAMOND_ORE, 4)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(8, 16, 128))).square());
    public static final ConfiguredFeature<?, ?> ORE_DIAMOND_NETHER_LARGE = register("ore_diamond_nether_large", Feature.NO_SURFACE_ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, ModStates.NETHER_DIAMOND_ORE, 5)).withPlacement(Placement.DEPTH_AVERAGE.configure(new DepthAverageConfig(16, 8))).square());


    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }

    public static final class ModStates {
        protected static final BlockState NETHER_IRON_ORE = BlocksRegistry.NETHER_IRON_ORE.get().getDefaultState();
        protected static final BlockState NETHER_DIAMOND_ORE = BlocksRegistry.NETHER_DIAMOND_ORE.get().getDefaultState();
    }
}