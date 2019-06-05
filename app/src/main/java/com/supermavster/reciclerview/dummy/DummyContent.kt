package com.supermavster.reciclerview.dummy

import java.util.ArrayList
import java.util.HashMap
import kotlin.random.Random

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 10

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i))
        }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int): DummyItem {
        return DummyItem(position.toString(), "Persona #" + position, makeDetails(position))
    }



    private fun makeDetails(position: Int): ArrayList<String> {
        val names = arrayOf<String>("María Carmen","María","Carmen","Josefa","Ana María","Isabel","María Pilar","María Dolores","Laura","María Teresa");
        val nextValues = List(COUNT) { Random.nextInt(111111, 9999999) }

        val builder = ArrayList<String>();
        builder.add(names[position-1]);
        builder.add(nextValues[position-1].toString());
        return builder
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val content: String, val details: ArrayList<String>) {
        override fun toString(): String = id
    }

}
