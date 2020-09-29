package com.firemuffin303.morenetherore.registry;

import com.firemuffin303.morenetherore.core.MoreNetherOre;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
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

    public static final RegistryObject<Block> NETHER_IRON_ORE = BLOCKS.register("nether_iron_ore",() -> new Block(NetherOreBlockProperties.NETHER_ORES));
    public static final RegistryObject<Block> NETHER_COAL_ORE = BLOCKS.register("nether_coal_ore",() -> new Block(NetherOreBlockProperties.NETHER_ORES));
    public static final RegistryObject<Block> NETHER_DIAMOND_ORE = BLOCKS.register("nether_diamond_ore",() -> new Block(NetherOreBlockProperties.NETHER_ORES));

    public static final RegistryObject<Item> NETHER_IRON_ORE_ITEM = ITEMS.register("nether_iron_ore",() -> new BlockItem(NETHER_IRON_ORE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> NETHER_COAL_ORE_ITEM = ITEMS.register("nether_coal_ore",() -> new BlockItem(NETHER_COAL_ORE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
    public static final RegistryObject<Item> NETHER_DIAMOND_ORE_ITEM = ITEMS.register("nether_diamond_ore",() -> new BlockItem(NETHER_DIAMOND_ORE.get(),new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

}
