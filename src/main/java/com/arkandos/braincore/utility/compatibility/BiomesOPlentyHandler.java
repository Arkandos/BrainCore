package com.arkandos.braincore.utility.compatibility;

import com.arkandos.braincore.utility.LogHelper;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class BiomesOPlentyHandler
{    // Blocks
    public static Block ASH;

    public static final String NAME = "BiomesOPlenty";
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
