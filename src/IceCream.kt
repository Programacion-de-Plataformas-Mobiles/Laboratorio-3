class IceCream() : Food(), Dessert{

    override val name: String = "Helado"
    override val price: Double = 9.0

    override fun cook(): String {
        return "Enfriando el $name en el congelador hasta que esté firme y cremoso."
    }

    override fun eat(): String {
        return "Disfrutando del $name con una cuchara, sintiendo su textura suave y cremosa en cada bocado."
    }
}