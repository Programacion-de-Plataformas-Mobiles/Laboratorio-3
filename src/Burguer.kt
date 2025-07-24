class Burguer() : Food() {

    override val name: String = "Hamburguesa"
    override val price: Double = 29.99

    override fun cook(): String {
        return "Asando la $name a la parrilla hasta que esté dorada por fuera y jugosa por dentro."
    }
}