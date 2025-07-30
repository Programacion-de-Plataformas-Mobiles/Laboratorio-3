fun Food.discountedPrice(descuento: Double): Double {
    return this.price * (100 - descuento) / 100
}

fun main() {
    val hamburguesa = Burguer()
    val pizza = Pizza()
    val helado = IceCream()
    val jugo = Juice()

    println(hamburguesa.cook())
    println(pizza.cook())
    println(helado.cook())
    println(jugo.cook())
    println(helado.eat())
}