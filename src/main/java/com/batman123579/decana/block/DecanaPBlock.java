package com.batman123579.decana.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DecanaPBlock {

	public static void mainRegistry(){
		initialiseBlock();
		registerBlock();
	}
	
	public static Block DecanaPBlock;
	
	public static void initialiseBlock(){
		DecanaPBlock = new DecanaPortalBlock(Material.ground).setBlockName("DecanaPBlock").setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public static void registerBlock(){
		GameRegistry.registerBlock(DecanaPBlock, DecanaPBlock.getUnlocalizedName());
		
	}
}
