package bballdaniel3.runningshoesmod.init;

import java.util.ArrayList;
import java.util.List;

import bballdaniel3.runningshoesmod.Items.ArmorBase;
import bballdaniel3.runningshoesmod.Items.ItemBase;
import bballdaniel3.runningshoesmod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ArmorMaterial ARMOR_RUNNING_SHOES = EnumHelper.addArmorMaterial("running_shoes", Reference.MOD_ID + ":running_shoes", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
	public static final ArmorMaterial ARMOR_IRON_RUNNING_SHOES = EnumHelper.addArmorMaterial("iron_running_shoes", Reference.MOD_ID + ":iron_running_shoes", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);		
	public static final ArmorMaterial ARMOR_GOLD_RUNNING_SHOES = EnumHelper.addArmorMaterial("gold_running_shoes", Reference.MOD_ID + ":gold_running_shoes", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);		
	public static final ArmorMaterial ARMOR_DIAMOND_RUNNING_SHOES = EnumHelper.addArmorMaterial("diamond_running_shoes", Reference.MOD_ID + ":diamond_running_shoes", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	public static final Item RUNNING_SHOES = new ArmorBase("running_shoes", ARMOR_RUNNING_SHOES, 1, EntityEquipmentSlot.FEET);
	public static final Item LEATHER_RUNNING_SHOES = new ArmorBase("leather_running_shoes", ARMOR_RUNNING_SHOES, 1, EntityEquipmentSlot.FEET);
	public static final Item IRON_RUNNING_SHOES = new ArmorBase("iron_running_shoes", ARMOR_IRON_RUNNING_SHOES, 1, EntityEquipmentSlot.FEET);
	public static final Item GOLD_RUNNING_SHOES = new ArmorBase("gold_running_shoes", ARMOR_GOLD_RUNNING_SHOES, 1, EntityEquipmentSlot.FEET);
	public static final Item DIAMOND_RUNNING_SHOES = new ArmorBase("diamond_running_shoes", ARMOR_DIAMOND_RUNNING_SHOES, 1, EntityEquipmentSlot.FEET);
}
