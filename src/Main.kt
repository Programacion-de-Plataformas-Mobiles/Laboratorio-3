fun Food.discountedPrice(descuento: Double): Double {
    return this.price * (100 - descuento) / 100
}