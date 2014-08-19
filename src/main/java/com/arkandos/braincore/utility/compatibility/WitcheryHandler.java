package com.arkandos.braincore.utility.compatibility;

import cpw.mods.fml.common.Loader;

public class WitcheryHandler
{
    public static final String NAME = "witchery";
    private static boolean isModLoaded = false;

    public static enum Trees
    {
        rowan,
        alder,
        hawthorn,
        ;

        public String getLog()
        {
            return "witchlog." + this.toString();
        }

        public String getPlank()
        {
            return "witchwood." + this.toString();
        }

        public String getSapling()
        {
            return "witchsapling." + this.toString();
        }

        public String getLeaves()
        {
            return "witchleaves." + this.toString();
        }
    }

    public static enum Plants
    {
        belladonna,
        mandrake,
        artichoke,
        snowbell,
        mindrake,
        wormwood,
        ;

        public String getSeed()
        {
            return "seeds" + this.toString();
        }

        public String getPlant()
        {
            return this.toString();
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

        }
    }

    public static void postInit()
    {
        if (isLoaded())
        {

        }
    }
}
