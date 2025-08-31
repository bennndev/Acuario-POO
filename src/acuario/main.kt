package acuario

fun construirAcuario() {

}

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("Color del tiburón: ${tiburon.color}")
    println("Color del pez payaso: ${pezPayaso.color}")
}

fun main() {
    crearPeces()
}



