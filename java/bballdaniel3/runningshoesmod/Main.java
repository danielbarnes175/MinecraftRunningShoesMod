package bballdaniel3.runningshoesmod;

import bballdaniel3.runningshoesmod.proxy.CommonProxy;
import bballdaniel3.runningshoesmod.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME,version = Reference.VERSION)
public class Main {

		@Instance
		public static Main instance;
		
		@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
		public static CommonProxy proxy;
		
		@EventHandler
		public static void PreInit(FMLPreInitializationEvent event) {
			
		}
		
		@EventHandler
		public static void init(FMLPreInitializationEvent event) {
			
		}
		
		@EventHandler
		public static void PostInit(FMLPreInitializationEvent event) {
			
		}
}
