package com.arkandos.braincore.utility.compatibility;

public class ModHandler
{
    public static void preInit()
    {
        BiomesOPlentyHandler.preInit();
        HarvestCraftHandler.preInit();
        MekanismHandler.preInit();
        MineFactoryReloadedHandler.preInit();
        WitcheryHandler.preInit();
    }

    public static void init()
    {
        BiomesOPlentyHandler.init();
        HarvestCraftHandler.init();
        MekanismHandler.init();
        MineFactoryReloadedHandler.init();
        WitcheryHandler.init();
    }

    public static void postInit()
    {
        BiomesOPlentyHandler.postInit();
        HarvestCraftHandler.postInit();
        MekanismHandler.postInit();
        MineFactoryReloadedHandler.postInit();
        WitcheryHandler.postInit();
    }
}
