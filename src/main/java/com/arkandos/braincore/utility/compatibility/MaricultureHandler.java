package com.arkandos.braincore.utility.compatibility;

import cpw.mods.fml.common.Loader;
import mariculture.api.core.MaricultureHandlers;
import mariculture.api.core.RecipeSmelter;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class MaricultureHandler {

    public static final String NAME = "Mariculture";
    private static boolean isModLoaded = false;

    public static String getName(){
        return NAME;
    }

    public static boolean isLoaded(){
        return isModLoaded;
    }

    public static void preInit(){
        if (Loader.isModLoaded(getName())){
            isModLoaded = true;
        }
    }

    public static void init(){
        if (isLoaded()){

        }
    }

    public static void postInit(){
        if (isLoaded()){

        }
    }

    public static void addCrucibleRecipe(ItemStack input, int temp, FluidStack fluid, ItemStack output, int outputChance){
        if (isLoaded()) {
            MaricultureHandlers.crucible.addRecipe(new RecipeSmelter(input, temp, fluid, output, outputChance));
        }
    }
}
