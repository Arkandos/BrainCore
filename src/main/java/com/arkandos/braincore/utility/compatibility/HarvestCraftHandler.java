package com.arkandos.braincore.utility.compatibility;


import com.arkandos.braincore.utility.LogHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.oredict.OreDictionary;

public class HarvestCraftHandler
{
    public static final String NAME = "harvestcraft";
    private static boolean isModLoaded = false;

    public static enum Crops
    {
        asparagus,
        barley,
        bean,
        beet,
        broccoli,
        cauliflower,
        celery,
        cranberry,
        garlic,
        ginger,
        leek,
        lettuce,
        oats,
        onion,
        parsnip,
        peanut,
        pineapple,
        radish,
        rice,
        rutabaga,
        rye,
        scallion,
        soybean,
        spiceleaf,
        sweetpotato,
        tealeaf,
        turnip,
        whitemushroom,

        artichoke,
        bellpepper,
        blackberry,
        blueberry,
        brusselsprout,
        cabbage,
        cactusfruit,
        candleberry,
        cantaloupe,
        chilipepper,
        coffeebean,
        corn,
        cotton,
        cucumber,
        eggplant,
        grape,
        kiwi,
        mustardseeds,
        okra,
        peas,
        raspberry,
        rhubarb,
        seaweed,
        strawberry,
        tomato,
        wintersquash,
        zucchini,
        bambooshoot,
        ;

        public String getSeed()
        {
            return this.toString() + "Item";
        }

        public String getCrop()
        {
            return "pam" + this.toString() + "Crop";
        }
    }

    public static enum Fruits
    {
        almond,
        apricot,
        avocado,
        banana,
        cashew,
        cherry,
        chestnut,
        cinnamon,
        coconut,
        date,
        dragonfruit,
        durian,
        fig,
        grape,
        lemon,
        lime,
        mango,
        nutmeg,
        olive,
        orange,
        papaya,
        peach,
        pear,
        pecan,
        peppercorn,
        persimmon,
        pistachio,
        plum,
        pomegranate,
        starfruit,
        vanillabean,
        walnut,
        ;

        public String getFruit()
        {
            return this.toString() + "Item";
        }

        public String getSapling()
        {
            return "pam" + this.toString() + "Sapling";
        }
    }

    public static enum Fish
    {
        perch,
        herring,
        octopus,
        carp,
        catfish,
        scallop,
        turtle,
        jellyfish,
        bass,
        grouper,
        shrimp,
        tilapia,
        trout,
        crayfish,
        walleye,
        eel,
        crab,
        anchovy,
        clam,
        snapper,
        snail,
        tuna,
        mudfish,
        frog,
        charr,
        ;

        public String getFish(){
            return this.toString() + "rawItem";
        }
    }

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
        if(isLoaded())
        {

        }
    }

    public static void getBlocks()
    {

    }

    public static void getItems()
    {

    }

    public static void registerHarvestableCrop(String cropName, int metaData)
    {
        ItemStack is = GameRegistry.findItemStack(getName(), cropName, 1);
        is.setItemDamage(metaData);
        MineFactoryReloadedHandler.registerHarvestableCrop(is);
    }

    public static void registerHarvestableCrop(String cropName)
    {
        registerHarvestableCrop(cropName, 7);
    }

    public static void registerPlantableCrop(String seedName, String cropName)
    {
        NBTTagCompound tag = new NBTTagCompound();
        tag.setString("seed", GameRegistry.findUniqueIdentifierFor(GameRegistry.findItem(getName(), seedName)).toString());
        tag.setString("crop", GameRegistry.findUniqueIdentifierFor(GameRegistry.findBlock(getName(), cropName)).toString());
        MineFactoryReloadedHandler.registerPlantableCrop(tag);
    }

    public static void registerCrop(String seedName, String cropName, int cropMetadata)
    {
        registerHarvestableCrop(cropName, cropMetadata);
        registerPlantableCrop(seedName, cropName);
    }

    public void registerCrop(String seedName, String cropName)
    {
        registerCrop(seedName, cropName, 7);
    }
}
