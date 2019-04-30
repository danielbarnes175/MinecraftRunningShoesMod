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

	protected float speed;
	
	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, float speed) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		this.speed = speed;
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
			((EntityPlayer)entityIn).capabilities.setPlayerWalkSpeed(speed);

		} else {
			((EntityPlayer)entityIn).capabilities.setPlayerWalkSpeed(0.1F);
		}
    }

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
