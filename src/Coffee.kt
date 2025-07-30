class Coffee : Drink() {

    override val name: String = "Café"
    override val price: Double = 12.0

    override fun pour(): String {
        return "Sirviendo el $name caliente en una taza."
    }

    override fun cook(): String {
        return "Preparando el $name con granos recién molidos y agua caliente."
    }
}