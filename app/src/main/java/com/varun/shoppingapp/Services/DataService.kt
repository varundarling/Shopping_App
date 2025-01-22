package com.varun.shoppingapp.Services

import android.security.identity.PersonalizationData
import com.varun.shoppingapp.Model.Category
import com.varun.shoppingapp.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Triangle Hat with logo","₹299","hat1"),
        Product("Black Cap with logo","₹199","hat2"),
        Product("White Cap with logo","₹399","hat3"),
        Product("Latest Cap with logo","₹499","hat4"),
    )

    val hoodies = listOf(
        Product("Black Hoodie with logo","₹999","hoodie1"),
        Product("Red Hoodie with logo","₹1099","hoodie2"),
        Product("Black custom with logo","₹899","hoodie3"),
        Product("Black with red logo","₹1199","hoodie4")
    )

    val shirts = listOf(
        Product("Black T-Shirt with logo","₹299","shirt1"),
        Product("Grey T-Shirt with logo","₹399","shirt2"),
        Product("Red T-Shirt with logo","₹499","shirt3"),
        Product("Light Black T-Shirt with logo","₹199","shirt4"),
        Product("Black T-Shirt with new logo","₹499","shirt5")
    )
}