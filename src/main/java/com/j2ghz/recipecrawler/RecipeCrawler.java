package com.j2ghz.recipecrawler;

import com.j2ghz.recipecrawler.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "RecipeCrawler", name = "RecipeCrawler", version = "1.7.10-1.0")
public class RecipeCrawler {
    @Mod.Instance("RecipeCrawler")
    public static RecipeCrawler instance;

    @SidedProxy(clientSide = "com.j2ghz.recipecrawler.proxy.ClientProxy", serverSide = "com.j2ghz.recipecrawler.proxy.ClientProxy")
    public static IProxy  proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
