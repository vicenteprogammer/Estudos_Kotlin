fun main(){
    val list = listOf("Anderson", "Lorena", "Vicente", "Andre" )
    println(list.filter { it.startsWith("A", ignoreCase = true) })
}