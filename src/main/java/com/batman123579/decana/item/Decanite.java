package com.batman123579.decana.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Decanite {

	public static void mainRegistry(){
		initialiseItem();
		registerItem();
	}
	
	public static Item Decanite;
	
	public static void initialiseItem(){
		Decanite = new Item().setUnlocalizedName("Decanite").setCreativeTab(CreativeTabs.tabMisc);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(Decanite, Decanite.getUnlocalizedName());
	}
	
}
