package bballdaniel3.runningshoesmod.util.handlers;

import java.util.HashMap;
import java.util.Map;

import bballdaniel3.runningshoesmod.util.Reference;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Config(modid = Reference.MOD_ID)
public class ConfigHandler {

	@Config.Comment({"This is where you will change the speed that you will have when equipping the running shoes. For reference, minecraft's default movement speed is 0.1"})
	public static final Map<String, Float> General = new HashMap<>();
	
	static {
		General.put("Running Shoes Speed", .150F);
		General.put("Sprinting Shoes Speed", .30F);
	}

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	private static class EventHandler {

		/**
		 * Inject the new values and save to the config file when the config has been changed from the GUI.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(Reference.MOD_ID)) {
				ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
			}
		}
	}
}