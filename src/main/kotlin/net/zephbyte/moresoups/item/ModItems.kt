package net.zephbyte.moresoups.item

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import net.zephbyte.moresoups.MoreSoups

class ModItems {
    companion object {

        val HAM_AND_POTATO_SOUP: Item = registerItem("ham_and_potato_soup", Item(Item.Settings()))
        val CHICKEN_NOODLE_SOUP: Item = registerItem("chicken_noodle_soup", Item(Item.Settings()))
        val BEEF_STEW: Item = registerItem("beef_stew", Item(Item.Settings()))

        private fun registerItem(name: String, item: Item): Item {
            return Registry.register(Registries.ITEM, Identifier.of(MoreSoups.MOD_ID, name), item)
        }

        fun registerModItems() {
            MoreSoups.logger.info("Registering mod items for " + MoreSoups.MOD_ID)

            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register{ entries ->
                entries.add(HAM_AND_POTATO_SOUP)
                entries.add(CHICKEN_NOODLE_SOUP)
                entries.add(BEEF_STEW)
            }
        }
    }
}