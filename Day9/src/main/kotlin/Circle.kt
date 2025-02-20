class Circle(
    val radius: Double
): Shape(name = "Circle") {
    private val pi = 3.14
    init {
        println("$name created  with radius of $radius")
        println("My area is ${area()}")
        println("My perimeter is ${perimeter()}")
    }

    override fun area(): Double = radius * radius * pi

    override fun perimeter(): Double = 2 * radius * pi
}