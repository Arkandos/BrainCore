package com.arkandos.braincore;

import com.arkandos.braincore.proxy.IProxy;
import com.arkandos.braincore.utility.LogHelper;
import com.arkandos.braincore.utility.Reference;
import com.arkandos.braincore.utility.compatibility.ModHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_NAME, dependencies = Reference.DEPENDENCIES, version = Reference.VERSION)
public class BrainCore {

    @Mod.Instance(Reference.MOD_NAME)
    public static BrainCore instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModHandler.preInit();
        LogHelper.info("preInit completed");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModHandler.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        ModHandler.postInit();
    }

}
