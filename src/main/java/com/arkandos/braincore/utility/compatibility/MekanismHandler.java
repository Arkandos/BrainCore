package com.arkandos.braincore.utility.compatibility;

import com.arkandos.braincore.utility.LogHelper;
import cpw.mods.fml.common.Loader;
import net.minecraft.item.ItemStack;

public class MekanismHandler
{

    public static final String NAME = "Mekanism";
    private static boolean isModLoaded = false;

    public static String getName()
    {
        return NAME;
    }

    public static boolean isLoaded()
    {
        return isModLoaded;
    }

    public static void preInit()
    {
        if (Loader.isModLoaded(NAME))
        {
            isModLoaded = true;
        }
    }

    public static void init()
    {
        if (isLoaded())
        {

        }
    }

    public static void postInit()
    {
        if (isLoaded())
        {

        }
    }
}
