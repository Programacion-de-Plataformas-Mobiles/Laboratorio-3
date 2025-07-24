class Juice : Drink() {

    override val name: String = "Jugo de Naranja"
    override val price: Double = 19.99

    override fun pour(): String {
        return "Vierte el $name fresco en un vaso y disfruta de su sabor cítrico y refrescante."
    }

    override fun cook(): String {
        return "Exprimiendo frutas frescas para obtener un jugo natural y delicioso."
    }
}