package com.yungnickyoung.minecraft.betterdeserttemples.init;

import com.yungnickyoung.minecraft.betterdeserttemples.BetterDesertTemples;
import com.yungnickyoung.minecraft.betterdeserttemples.world.processor.*;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class BDTModProcessors {
    public static StructureProcessorType<PolishedDioriteProcessor> POLISHED_DIORITE_PROCESSOR = () -> PolishedDioriteProcessor.CODEC;
    public static StructureProcessorType<DioriteProcessor> DIORITE_PROCESSOR = () -> DioriteProcessor.CODEC;
    public static StructureProcessorType<SpongeProcessor> SPONGE_PROCESSOR = () -> SpongeProcessor.CODEC;
    public static StructureProcessorType<EndStoneBrickWallProcessor> END_STONE_BRICK_WALL_PROCESSOR = () -> EndStoneBrickWallProcessor.CODEC;
    public static StructureProcessorType<WhiteStainedGlassProcessor> WHITE_STAINED_GLASS_PROCESSOR = () -> WhiteStainedGlassProcessor.CODEC;
    public static StructureProcessorType<LimeBannerProcessor> LIME_BANNER_PROCESSOR = () -> LimeBannerProcessor.CODEC;

    public static void init() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(BDTModProcessors::commonSetup);
    }

    private static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            Registry.register(Registry.STRUCTURE_PROCESSOR, new ResourceLocation(BetterDesertTemples.MOD_ID, "polished_diorite_processor"), POLISHED_DIORITE_PROCESSOR);
            Registry.register(Registry.STRUCTURE_PROCESSOR, new ResourceLocation(BetterDesertTemples.MOD_ID, "diorite_processor"), DIORITE_PROCESSOR);
            Registry.register(Registry.STRUCTURE_PROCESSOR, new ResourceLocation(BetterDesertTemples.MOD_ID, "sponge_processor"), SPONGE_PROCESSOR);
            Registry.register(Registry.STRUCTURE_PROCESSOR, new ResourceLocation(BetterDesertTemples.MOD_ID, "end_stone_brick_wall_processor"), END_STONE_BRICK_WALL_PROCESSOR);
            Registry.register(Registry.STRUCTURE_PROCESSOR, new ResourceLocation(BetterDesertTemples.MOD_ID, "white_stained_glass_processor"), WHITE_STAINED_GLASS_PROCESSOR);
            Registry.register(Registry.STRUCTURE_PROCESSOR, new ResourceLocation(BetterDesertTemples.MOD_ID, "lime_banner_processor"), LIME_BANNER_PROCESSOR);
        });
    }
}
