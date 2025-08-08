/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pvpcheat.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.pvpcheat.item.IndestructibleArmorItem;
import net.mcreator.pvpcheat.item.FakeArrowItem;
import net.mcreator.pvpcheat.item.DestructoUltraItem;
import net.mcreator.pvpcheat.CheatersMod;

import java.util.function.Function;

public class CheatersModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CheatersMod.MODID);
	public static final DeferredItem<Item> DESTRUCTO_ULTRA = register("destructo_ultra", DestructoUltraItem::new);
	public static final DeferredItem<Item> FAKE_ARROW = register("fake_arrow", FakeArrowItem::new);
	public static final DeferredItem<Item> INDESTRUCTIBLE_ARMOR_HELMET = register("indestructible_armor_helmet", IndestructibleArmorItem.Helmet::new);
	public static final DeferredItem<Item> INDESTRUCTIBLE_ARMOR_CHESTPLATE = register("indestructible_armor_chestplate", IndestructibleArmorItem.Chestplate::new);
	public static final DeferredItem<Item> INDESTRUCTIBLE_ARMOR_LEGGINGS = register("indestructible_armor_leggings", IndestructibleArmorItem.Leggings::new);
	public static final DeferredItem<Item> INDESTRUCTIBLE_ARMOR_BOOTS = register("indestructible_armor_boots", IndestructibleArmorItem.Boots::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}