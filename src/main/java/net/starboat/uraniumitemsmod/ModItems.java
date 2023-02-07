package net.starboat.uraniumitemsmod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //Ingredient Items
    public static final Item URANIUM = registerItem("uranium", new Item(new FabricItemSettings()));
    public static final Item RAW_URANIUM = registerItem("raw_uranium", new Item(new FabricItemSettings()));



    public static void addItemsToItemGroup()
    {
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_URANIUM);
        addToItemGroup(ItemGroups.INGREDIENTS, URANIUM);
    }

    //ItemGroup Modifier
    public static void addToItemGroup(ItemGroup group, Item item)
    {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(UraniumMod.MODID, name), item);
    }
    public static void registerModItems()
    {
        UraniumMod.LOGGER.info("Registering Mod Items for " + UraniumMod.MODID);
        addItemsToItemGroup();
    }
}
