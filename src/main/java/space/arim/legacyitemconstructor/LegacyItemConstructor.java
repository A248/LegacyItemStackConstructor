/* 
 * LegacyItemStackConstructor
 * Copyright © 2020 Anand Beh <https://www.arim.space>
 * 
 * LegacyItemStackConstructor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * LegacyItemStackConstructor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with LegacyItemStackConstructor. If not, see <https://www.gnu.org/licenses/>
 * and navigate to version 3 of the GNU General Public License.
 */
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
