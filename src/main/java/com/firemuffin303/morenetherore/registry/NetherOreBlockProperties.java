package com.firemuffin303.morenetherore.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class NetherOreBlockProperties {
    public static final Block.Properties NETHER_ORES = AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3,3).sound(SoundType.field_235599_U_).harvestLevel(0).harvestTool(ToolType.PICKAXE);

}
