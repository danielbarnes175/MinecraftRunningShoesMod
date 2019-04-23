package bballdaniel3.runningshoesmod.Items;

import java.util.ArrayList;
import java.util.List;

import bballdaniel3.runningshoesmod.Main;
import bballdaniel3.runningshoesmod.init.ModItems;
import bballdaniel3.runningshoesmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ArmorBase extends ItemArmor implements IHasModel {

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TRANSPORTATION);
		setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}
	@Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {	
		if (itemSlot == 0) {
			// You can either choose to set the walking speed of the player higher, or just add a speed 1 potion effect.
			// I prefer the former option of setting the speed.
			// player.addPotionEffect(new PotionEffect(Potion.REGISTRY.getObjectById(1), 0, 0));
			((EntityPlayer)entityIn).capabilities.setPlayerWalkSpeed(0.15F);

		} else {
			((EntityPlayer)entityIn).capabilities.setPlayerWalkSpeed(0.1F);
		}
    }
	/*
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		for (Item i : ModItems.ITEMS) {
			// Hacky way of comparing an Item with an ItemStack. I'm comparing the strings of their name.
			// There is probably a way to actually check them, but I'm not sure exactly how, so for now we're stuck with this.
			if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getUnlocalizedName().equals(i.getUnlocalizedName())) {

				// You can choose to either change the speed of the player, or just add a potion effect.
				// I prefer to change the speed of the player because then if you drink a speed potion it will still have an effect.
				// player.addPotionEffect(new PotionEffect(Potion.REGISTRY.getObjectById(1), 0, 0));
				player.capabilities.setPlayerWalkSpeed(0.15F);
				break;
			}
			else {
				player.capabilities.setPlayerWalkSpeed(0.1F);
			} 
		}
	} */

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
