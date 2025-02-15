fun main(){
    println("Enter a five numbres: ")
    val n1 = readLine()?.toInt()
    val n2 = readLine()?.toInt()
    val n3 = readLine()?.toInt()
    val n4 = readLine()?.toInt()
    val n5 = readLine()?.toInt()

    val list = listOf(n1,n2,n3,n4,n5)

    val reversedList: List<Int> = mutableListOf()

    for (i in list.size - 1 downTo 0){
        println(list[i])


    }


}