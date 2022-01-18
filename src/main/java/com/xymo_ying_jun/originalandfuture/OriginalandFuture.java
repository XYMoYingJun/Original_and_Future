package com.xymo_ying_jun.originalandfuture;

import com.xymo_ying_jun.originalandfuture.proxy.CommonProxy;
import com.xymo_ying_jun.originalandfuture.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID,name = Reference.NAME,version = Reference.VERSION,acceptedMinecraftVersions = Reference.MC_VERSION)
public class OriginalandFuture {

    @Mod.Instance(Reference.MODID)
    public static OriginalandFuture instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit (FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event){
        proxy.postInit(event);
    }

}
