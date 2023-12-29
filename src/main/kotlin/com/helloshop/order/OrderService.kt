package com.helloshop.order

import com.helloshop.product.Product
import com.helloshop.user.User

fun main() {
    val user = User()
    val product = Product()
    val order = Order(user, product)
}