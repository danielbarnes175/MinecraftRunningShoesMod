package bballdaniel3.runningshoesmod.util;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;

public interface IShoeType {
	void onEquip(EntityLivingBase entity, TileEntity tileEntity, IShoeType shoe);
	void onUnequip(EntityLivingBase entity, TileEntity tileEntity, IShoeType shoe);
}
