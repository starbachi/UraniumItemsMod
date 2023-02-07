package net.starboat.uraniumitemsmod.armors;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModArmors {


    public static final ArmorMaterial URANIUM = new UraniumArmorMaterial();


    public static final Item URANIUM_HELMET = new ArmorItem(URANIUM, EquipmentSlot.HEAD, new Item.Settings());
    public static final Item URANIUM_CHESTPLATE = new ArmorItem(URANIUM, EquipmentSlot.CHEST, new Item.Settings());
    public static final Item URANIUM_LEGGINGS = new ArmorItem(URANIUM, EquipmentSlot.LEGS, new Item.Settings());
    public static final Item URANIUM_BOOTS = new ArmorItem(URANIUM, EquipmentSlot.FEET, new Item.Settings());


    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("uranium_items_mod", "uranium_helmet"), URANIUM_HELMET);
        Registry.register(Registries.ITEM, new Identifier("uranium_items_mod", "uranium_chestplate"), URANIUM_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("uranium_items_mod", "uranium_leggings"), URANIUM_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("uranium_items_mod", "uranium_boots"), URANIUM_BOOTS);
    }
}

