fun main(){
    //funções lambdas são funções que passam parametros para outras funções
    //Podemos criar a nossa propria function
    val c1 = Circle(5.0)
    val c2 = Circle(10.0)
    val r1 = Rectangle(10.0,2.0)
    val r2 = Rectangle(1.0,2.0)

    var shapes = listOf(c1,c2,r1,r2)
    shapes = shapes.customFilter { it.area() > 20.0 }.sortedBy { it.area() }
    for (shape in shapes){
        println("${shape.name} = Area = ${shape.area()}")
    }


}

fun List<Shape>.customFilter(filterFunction: (Shape) -> (Boolean)): List<Shape>{
    val resultList = mutableListOf<Shape>()
    for (shape in this){
        if (filterFunction(shape)){
            resultList.add(shape)
        }
    }
    return resultList
}