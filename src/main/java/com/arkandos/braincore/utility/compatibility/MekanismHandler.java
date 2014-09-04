package com.arkandos.braincore.utility.compatibility;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import mekanism.api.ChanceOutput;
import mekanism.api.RecipeHelper;
import mekanism.common.recipe.RecipeHandler;
import net.minecraft.item.ItemStack;

public class MekanismHandler
{

    public static final String NAME = "Mekanism";
    private static boolean isModLoaded = false;
    public static ItemStack biofuel;

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
            getBlocks();
            getItems();
        }
    }

    public static void postInit()
    {
        if (isLoaded())
        {

        }
    }

    public static void getBlocks()
    {

    }

    public static void getItems()
    {
        biofuel = GameRegistry.findItemStack(NAME, "BioFuel", 1);
    }

    public static void registerEnrichmentChamberRecipe(ItemStack input, ItemStack output)
    {
        if (isLoaded())
        {
            RecipeHandler.addEnrichmentChamberRecipe(input, output);
        }
    }

    public static void registerOsmiumCompressorRecipe(ItemStack input, ItemStack output)
    {
        if (isLoaded())
        {
            RecipeHelper.addOsmiumCompressorRecipe(input, output);
        }
    }

    public static void registerCombinerRecipe(ItemStack input, ItemStack output)
    {
        if (isLoaded())
        {
            RecipeHelper.addCombinerRecipe(input, output);
        }
    }

    public static void registerCrusherRecipe(ItemStack input, ItemStack output)
    {
        if (isLoaded())
        {
            RecipeHelper.addCrusherRecipe(input, output);
        }
    }

    public static void registerPurificationChamberRecipe(ItemStack input, ItemStack output)
    {
        if (isLoaded())
        {
            RecipeHelper.addPurificationChamberRecipe(input, output);
        }
    }

    public static void registerPrecisionSawmillRecipe(ItemStack input, ChanceOutput output)
    {
        if (isLoaded())
        {
            RecipeHelper.addPrecisionSawmillRecipe(input, output);
        }
    }

    public static void registerBiofuelRecipe(ItemStack input, int fuelAmount)
    {
        if (isLoaded() && fuelAmount > 0)
        {
            ItemStack b = biofuel.copy();
            b.stackSize = fuelAmount;
            registerCrusherRecipe(input, b);
        }
    }
}
