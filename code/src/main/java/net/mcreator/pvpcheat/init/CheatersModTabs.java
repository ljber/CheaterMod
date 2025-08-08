/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pvpcheat.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.pvpcheat.CheatersMod;

public class CheatersModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CheatersMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CHEATS = REGISTRY.register("cheats",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cheaters.cheats")).icon(() -> new ItemStack(Blocks.TNT)).displayItems((parameters, tabData) -> {
				tabData.accept(CheatersModItems.DESTRUCTO_ULTRA.get());
				tabData.accept(CheatersModItems.FAKE_ARROW.get());
				tabData.accept(CheatersModItems.INDESTRUCTIBLE_ARMOR_HELMET.get());
				tabData.accept(CheatersModItems.INDESTRUCTIBLE_ARMOR_CHESTPLATE.get());
				tabData.accept(CheatersModItems.INDESTRUCTIBLE_ARMOR_LEGGINGS.get());
				tabData.accept(CheatersModItems.INDESTRUCTIBLE_ARMOR_BOOTS.get());
			}).build());
}