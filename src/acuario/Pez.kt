package acuario

class PezPayaso : Pez(), AccionPez {
    override val color: String = "dorado"
    override fun comer() {
        println("Pez payaso: Comer algas")
    }
}
