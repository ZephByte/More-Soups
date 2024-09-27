package net.zephbyte.moresoups.item

import net.minecraft.component.type.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.Items

class ModFoodComponents {

    companion object {
        val HAM_AND_POTATO_SOUP = createStew(8, 0.6f, Items.BOWL)
        val CHICKEN_NOODLE_SOUP = createStew(6, 0.5f, Items.BOWL)
        val BEEF_STEW = createStew(10, 0.8f, Items.BOWL)

        private fun createStew(nutrition: Int, saturation: Float, conversionItem: Item): FoodComponent {
            return FoodComponent.Builder().nutrition(nutrition)
                .saturationModifier(saturation).usingConvertsTo(conversionItem)
                .build()
        }

    }

}