fun Food.discountedPrice(descuento: Int): Double {
    return String.format("%.2f", this.price * (100 - descuento) / 100).toDouble()
}

fun main() {
    val hamburguesa = Burguer()
    val pizza = Pizza()
    val helado = IceCream()
    val jugo = Juice()
    val pastel = Cake()
    val cafe = Coffee()

    println("Preparando la hamburguesa: ${hamburguesa.cook()}")
    println("Preparando la pizza: ${pizza.cook()}")
    println("Preparando el helado: ${helado.cook()}")
    println("Preparando el jugo: ${jugo.cook()}")
    println("Comiendo el helado: ${helado.eat()}")
    println("El precio de la hamburguesa con descuento es: Q. ${hamburguesa.discountedPrice(10)}")
    println("Preparando el pastel: ${pastel.cook()}")
    println("Comiendo el pastel: ${pastel.eat()}")
    println("El precio del pastel con descuento es: Q. ${pastel.discountedPrice(20)}")
    println("Preparando el cafe: ${cafe.cook()}")
    println("Sirviendo el cafe: ${cafe.pour()}")
    println("El precio del cafe con descuento es: Q. ${cafe.discountedPrice(15)}")
}