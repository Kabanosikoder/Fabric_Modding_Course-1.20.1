package net.panther.mccourse.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.panther.mccourse.MCCourseMod;
import net.panther.mccourse.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MCCourseMod.MOD_ID, "pink_garnet_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pink_garnet_group"))
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET)).entries((displayContext, entries) -> {
                        // adds entries to the Item Group in the creative mode tab
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.PEAT_BRICK);

                        entries.add(ModItems.PINK_GARNET_SWORD);
                        entries.add(ModItems.PINK_GARNET_AXE);
                        entries.add(ModItems.PINK_GARNET_HOE);
                        entries.add(ModItems.PINK_GARNET_SHOVEL);
                        entries.add(ModItems.PINK_GARNET_PICKAXE);
                        entries.add(ModItems.PINK_GARNET_PAXEL);
                          // the order in which you add the items is the order
                         // that MC adds them into the item tab
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
                        entries.add(ModBlocks.NETHER_PINK_GARNET_ORE);
                        entries.add(ModBlocks.END_STONE_PINK_GARNET_ORE);

                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add((ModBlocks.PINK_GARNET_SLAB));
                        entries.add((ModBlocks.PINK_GARNET_STAIRS));
                        entries.add((ModBlocks.PINK_GARNET_BUTTON));
                        entries.add((ModBlocks.PINK_GARNET_PRESSURE_PLATE));
                        entries.add((ModBlocks.PINK_GARNET_FENCE));
                        entries.add((ModBlocks.PINK_GARNET_FENCE_GATE));
                        entries.add((ModBlocks.PINK_GARNET_WALL));
                        entries.add((ModBlocks.PINK_GARNET_DOOR));
                        entries.add((ModBlocks.PINK_GARNET_TRAP_DOOR));



                    }).build());

    public static void registerItemGroups(){

    }
}
