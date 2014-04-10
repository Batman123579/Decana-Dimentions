package com.batman123579.decana.main;

import com.batman123579.decana.block.DecanaPBlock;
import com.batman123579.decana.block.DecanaPortalBlock;
import com.batman123579.decana.item.Decanite;
import com.batman123579.decana.lib.Strings;





import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)

public class MainRegistry {
	
	@SidedProxy(clientSide = "com.batman123579.decana.main.ClientProxy", serverSide = "com.batman123579.decana.main.ServerProxy")
	public static ServerProxy proxy;
	
	/**
	 * Loads before
	 * @param PreEvent
	 */
	@EventHandler
	public static void Preload(FMLPreInitializationEvent PreEvent){
		Decanite.mainRegistry();
		DecanaPBlock.mainRegistry();
		proxy.registerRenderThings();
	}
	
	/**
	 * Loads during
	 * @param event
	 */
	@EventHandler
	public static void load(FMLInitializationEvent event){
	
	}
	
	/**
	 * Loads after
	 * @param PostEvent
	 */
	@EventHandler
	public static void Postload(FMLPostInitializationEvent PostEvent){
	
	}
	
}
