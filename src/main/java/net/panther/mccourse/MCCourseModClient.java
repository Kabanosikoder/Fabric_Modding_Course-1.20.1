package net.panther.mccourse;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.panther.mccourse.block.ModBlocks;

public class MCCourseModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // this makes the holes in a block see through non-opaque
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_TRAP_DOOR, RenderLayer.getCutout());

        // this makes the block translucent like glass:
        // BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_TRAP_DOOR, RenderLayer.getTranslucent());
    }
}
