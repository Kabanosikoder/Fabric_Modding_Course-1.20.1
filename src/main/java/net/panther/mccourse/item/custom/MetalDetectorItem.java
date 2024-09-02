package net.panther.mccourse.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Settings settings) {
        super(settings);
    }
    // This looks complicated but it's not so bad

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient) { // checks if it's client or server, if server then next is annulled
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            int i;
            for (i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockState blockState = context.getWorld().getBlockState(positionClicked.down(i));
                Block block = blockState.getBlock();

                if (isValuableBlock(blockState)) {
                    outputValuableCoords(positionClicked.down(i), player, block);
                    foundBlock = true;

                    break;
                }
            }


            if(!foundBlock){
                player.sendMessage((Text.translatable("item.mccourse.metal_detector.no_valuables")));
            }
        }

        context.getStack().damage(1,context.getPlayer(), playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }

    private void outputValuableCoords(BlockPos position, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Valuable ore found! " + block.getName().getString() + " at " + "(" +
                position.getX() + ", " + position.getY() + ", " + position.getZ() + ")")); // prints XYZ coords in chat
    }

    private boolean isValuableBlock(BlockState blockState) {
        return  blockState.getBlock() == Blocks.IRON_ORE || blockState.getBlock() == Blocks.DIAMOND_ORE ||
          blockState.getBlock() == Blocks.GOLD_ORE || blockState.getBlock() == Blocks.REDSTONE_ORE;
    }
}
