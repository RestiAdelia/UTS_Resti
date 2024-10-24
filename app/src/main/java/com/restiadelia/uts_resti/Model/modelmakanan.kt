package com.restiadelia.uts_resti.Model

import com.restiadelia.uts_resti.R

data class modelmakanan(
    val image : Int,
    val nama : String
)
object Mocklist1 {

    fun getmodel(): List<modelmakanan> {
        val itemModel1 = modelmakanan(
            R.drawable.makanan,
            "Chicken Curry"

        )

        val itemModel2 = modelmakanan(
            R.drawable.makan2,
            "Chicken Burger"
        )

        val itemModel3 = modelmakanan(
            R.drawable.makan2,
            "Borccoli lasagna"
        )

        val itemModel4 =modelmakanan(
            R.drawable.makan5,
            "Borccoli lasagna"
        )

        val itemModel5 =modelmakanan(
            R.drawable.makanan,
            "Borccoli lasagna"
        )



        val itemList: ArrayList<modelmakanan> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList

    }
}
