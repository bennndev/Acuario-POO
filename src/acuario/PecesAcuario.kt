package acuario

interface AccionPez {
    fun comer()
}

abstract class Pez {
    abstract val color: String
}
