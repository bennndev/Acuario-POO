package acuario

class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"

    override fun comer() {
        println("Tiburon: Cazar y comer peces")
    }
}


