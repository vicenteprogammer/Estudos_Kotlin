fun main(){
    val r1 = Rectangle(2.0,4.0)
    val c1 = Circle(5.0)
    val comparation = maxArtea(c1, r1)
    println(comparation)

}
fun maxArtea(shape1 : Shape,shape2: Shape): Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if(areaShape1 > areaShape2) areaShape1 else areaShape2
}