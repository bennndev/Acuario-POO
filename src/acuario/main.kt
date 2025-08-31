package acuario

fun construirAcuario() {

}

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    // Colores
    println("Color del tiburón: ${tiburon.color}")
    println("Color del pez payaso: ${pezPayaso.color}")

    // Comer
    tiburon.comer()
    pezPayaso.comer()
}

fun main() {
    crearPeces()
}



