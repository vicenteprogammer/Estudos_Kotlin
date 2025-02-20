fun main(){
    val circle = Circle(-1.0)
    val a = 3.0
    val b = 4.0
    val height = 2.0

    val paralelogramo = object: Shape("Paralelogramo", a,b,height){
        init {
            println("$name created with a = $a, b = $b ande height = $height")
        }

        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
            return (2 * a) * (2 * b)
        }

        fun isRectangle(): Boolean = height == b
    }
    val aT = 4.0
    val bT = 2.0
    val hT = 3.0
    val trapezio = object : Shape("Trapezio",  aT, bT, hT){
        init {
            println("$name created wiith a = $aT, b = $bT anf height = $hT")
        }

        override fun perimeter(): Double {
            return (2 * aT) * (2 * bT)
        }

        override fun area(): Double {
            return ((aT + bT) * hT) / 2
        }

        fun isRectangle(): Boolean = hT == bT
    }

    println(paralelogramo.isRectangle())
    println(trapezio.isRectangle())


}
fun maxArtea(shape1 : Shape,shape2: Shape): Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if(areaShape1 > areaShape2) areaShape1 else areaShape2
}