package net.starboat.uraniumitemsmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.starboat.uraniumitemsmod.armors.ModArmors;
import net.starboat.uraniumitemsmod.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UraniumMod implements ModInitializer {

	public static final String MODID = "uranium_items_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);


	public static final ItemGroup URANIUM_ARMOR_GROUP = FabricItemGroup.builder(new Identifier("uranium_items_mod", "uranium_armors"))
			.displayName(Text.literal("Uranium Armors"))
			.icon(() -> new ItemStack(ModItems.URANIUM)) // This uses the model of the new material you created as an icon, but you can reference to whatever you like
			.build();

	@Override
	public void onInitialize() {

		LOGGER.info("Starting Uranium Items Mod");
		ModItems.registerModItems();
		ModArmors.register();
	}
}