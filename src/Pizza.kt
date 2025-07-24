class Pizza() : Food() {

    override val name: String = "Pizza"
    override val price: Double = 99.98

    override fun cook(): String {
        return "Horneando la $name a 220 grados Celsius durante 15 minutos hasta que el queso esté burbujeante y la masa dorada."
    }
}