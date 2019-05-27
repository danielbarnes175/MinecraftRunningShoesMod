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
public class RSConfig {

	@Config.RequiresMcRestart
	@Config.Name("Enable Running Shoes")
	@Config.Comment({ "Choose whether or not you would like the regular running shoes to be enabled.\n\n"
					+ "WARNING: If disabling after starting a world, any shoes of this type will be lost. "
					+ "Additionally, you may receive a forge error upon start regarding missing registry items, "
					+ "but this is normal." })
	public static boolean runningShoesEnabled = true;
	
	@Config.RequiresMcRestart
	@Config.Name("Enable Sprinting Shoes")
	@Config.Comment({ "Choose whether or not you would like the sprinting shoes to be enabled.\n\n"
					+ "WARNING: If disabling after starting a world, any shoes of this type will be lost. "
					+ "Additionally, you may receive a forge error upon start regarding missing registry items, "
					+ "but this is normal." })
	public static boolean sprintingShoesEnabled = true;
	
	@Config.Comment({ "This is where you will change the speed that you will have when equipping the running shoes. For reference, minecraft's default movement speed is 0.1\n\n"
					+ "Values of 0 or below will make it so you cannot move. I would not recommend making the value below 0.1 because it defeats the purpose of the mod. "
					+ "Additionally, I haven't done much testing with higher values, so be careful when using them." })
	public static final Map<String, Float> Values = new HashMap<>();
	
	static {
		Values.put("Running Shoes Speed", .150F);
		Values.put("Sprinting Shoes Speed", .30F);
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