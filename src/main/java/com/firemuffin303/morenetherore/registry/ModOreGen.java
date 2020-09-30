package com.firemuffin303.morenetherore.registry;

import com.firemuffin303.morenetherore.core.MoreNetherOre;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = MoreNetherOre.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen {
    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event){
        for (Biome biome : ForgeRegistries.BIOMES){

            if (biome.getCategory() == Biome.Category.NETHER){

            }
        }
    }

}
