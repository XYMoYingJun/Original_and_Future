package com.xymo_ying_jun.originalandfuture.proxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event){
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event){
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event){
    }

}
