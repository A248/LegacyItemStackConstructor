package space.arim.legacyitemconstructor;

import org.bukkit.inventory.ItemStack;

/**
 * LegacyItemConstructor class
 * 
 * @author A248
 *
 */
public final class LegacyItemConstructor {
	
	private LegacyItemConstructor() {}
	
	/**
	 * Invokes the constructor
	 * 
	 * @param type the type
	 * @param amount the amount
	 * @param damage the damage
	 * @return the itemstack
	 */
	@SuppressWarnings("deprecation")
	public static ItemStack invoke(int type, int amount, short damage) {
		return new ItemStack(type, amount, damage);
	}
	
}
