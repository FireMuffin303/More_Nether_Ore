package com.firemuffin303.morenetherore.core;

import com.firemuffin303.morenetherore.init.BlocksRegistry;
import com.firemuffin303.morenetherore.world.gen.ModFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreNetherOre.MOD_ID)
@Mod.EventBusSubscriber(modid = MoreNetherOre.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoreNetherOre
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static  final String MOD_ID = "morenetherore";

    public MoreNetherOre() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        BlocksRegistry.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    @SubscribeEvent
    public void biomeGeneration (final BiomeLoadingEvent biome){
        if (biome.getCategory() == Biome.Category.NETHER) {
            biome.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_DECORATION)
                    .add(() -> ModFeatures.ORE_IRON_NETHER);
            biome.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_DECORATION)
                    .add(() -> ModFeatures.ORE_DIAMOND_NETHER_SMALL);
            biome.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_DECORATION)
                    .add(() -> ModFeatures.ORE_DIAMOND_NETHER_LARGE);
        }
    }
}


