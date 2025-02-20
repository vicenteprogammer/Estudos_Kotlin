abstract class Shape(
    var name : String
) {
    init {
        println("I am superclass")
    }

    fun changename(newName: String){
        name = newName
    }

    abstract fun area(): Double

    abstract fun perimeter() : Double


}
