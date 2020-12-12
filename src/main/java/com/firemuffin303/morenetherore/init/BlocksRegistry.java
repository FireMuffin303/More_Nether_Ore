package com.firemuffin303.morenetherore.init;

import com.firemuffin303.morenetherore.core.MoreNetherOre;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class BlocksRegistry {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreNetherOre.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreNetherOre.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    public static final RegistryObject<Block> NETHER_IRON_ORE = BLOCKS.register("nether_iron_ore",() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).setRequiresTool().sound(SoundType.NETHER_ORE).hardnessAndResistance(3.0f,3.0f)));
    public static final RegistryObject<Block> NETHER_DIAMOND_ORE = BLOCKS.register("nether_diamond_ore",() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.NETHERRACK).setRequiresTool().harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.NETHER_ORE).hardnessAndResistance(3)));


    public static final RegistryObject<Item> NETHER_IRON_ORE_ITEM = ITEMS.register("nether_iron_ore",() -> new BlockItem(NETHER_IRON_ORE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> NETHER_DIAMOND_ORE_ITEM = ITEMS.register("nether_diamond_ore",() -> new BlockItem(NETHER_DIAMOND_ORE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

}
