package com.arkandos.braincore.utility.compatibility;

import com.arkandos.braincore.utility.LogHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class MineFactoryReloadedHandler
{

    public static final String NAME = "MineFactoryReloaded";
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

    public static void sendMessage(String message, NBTTagCompound nbtTagCompound)
    {
        FMLInterModComms.sendMessage(getName(), message, nbtTagCompound);
    }

    public static void sendMessage(String message, ItemStack itemStack)
    {
        FMLInterModComms.sendMessage(getName(), message, itemStack);
    }

    public static void sendMessage(String message, String value)
    {
        FMLInterModComms.sendMessage(getName(), message, value);
    }

    public static void registerHarvestable(String name)
    {
        registerHarvestable(name, "Standard");
    }

    public static void registerHarvestable(String name, String type)
    {
        sendMessage("registerHarvestable_" + type, name);
    }

    public static void registerHarvestable(ItemStack itemStack, String type)
    {
        sendMessage("registerHarvestable_" + type, itemStack);
    }

    public static void registerHarvestable(NBTTagCompound tag, String type)
    {
        sendMessage("registerHarvestable_" + type, tag);
    }

    public static void registerHarvestableCrop(ItemStack itemStack)
    {
        registerHarvestable(itemStack, "Crop");
    }

    public static void registerHarvestableLeaves(String identifier)
    {
        registerHarvestable(identifier, "Leaves");
    }

    public static void registerHarvestableLog(String identifier)
    {
        registerHarvestable(identifier, "Log");
    }

    public static void registerPlantable(NBTTagCompound nbtTagCompound, String type)
    {
        sendMessage("registerPlantable_" + type, nbtTagCompound);
    }

    public static void registerPlantableCrop(NBTTagCompound nbtTagCompound)
    {
        registerPlantable(nbtTagCompound, "Crop");
    }

    public static void registerPlantableSapling(NBTTagCompound nbtTagCompound)
    {
        registerPlantable(nbtTagCompound, "Sapling");
    }

}

