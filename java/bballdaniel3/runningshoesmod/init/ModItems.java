package bballdaniel3.runningshoesmod.init;

import java.util.ArrayList;
import java.util.List;

import bballdaniel3.runningshoesmod.Items.ShoeItemBase;
import net.minecraft.item.Item;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item RUNNING_SHOES = new ShoeItemBase("running_shoes");
	public static final Item LEATHER_RUNNING_SHOES = new ShoeItemBase("leather_running_shoes");
	public static final Item IRON_RUNNING_SHOES = new ShoeItemBase("iron_running_shoes");
	public static final Item GOLD_RUNNING_SHOES = new ShoeItemBase("gold_running_shoes");
	public static final Item DIAMOND_RUNNING_SHOES = new ShoeItemBase("diamond_running_shoes");
}
