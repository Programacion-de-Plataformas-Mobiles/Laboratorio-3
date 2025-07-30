class Cake() : Food(), Dessert {

    override val name: String = "Pastel"
    override val price: Double = 15.5

    override fun cook(): String {
        return "Horneando el $name hasta que esté esponjoso y dorado."
    }

    override fun eat(): String {
        return "Saboreando el $name con una textura suave y dulce."
    }
}