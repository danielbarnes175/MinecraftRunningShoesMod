package bballdaniel3.runningshoesmod.Items;

import bballdaniel3.runningshoesmod.Main;
import bballdaniel3.runningshoesmod.init.ModItems;
import bballdaniel3.runningshoesmod.util.IHasModel;
import bballdaniel3.runningshoesmod.util.IShoeType;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;


public class ShoeItemBase extends Item implements IHasModel, IShoeType, ISpecialArmor {
	
	public ShoeItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TRANSPORTATION);
		setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	@Override
	public void onEquip(EntityLivingBase entity, TileEntity tileEntity, IShoeType shoe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUnequip(EntityLivingBase entity, TileEntity tileEntity, IShoeType shoe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage,
			int slot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
		// TODO Auto-generated method stub
		
	}
}
