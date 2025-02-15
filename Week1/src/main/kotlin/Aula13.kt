fun main(){
    val myArray1 = arrayOf(1,2,3,4)
    var sum1 = 0
    for (i in myArray1){
       sum1 += i
    }
    println(sum1)

    println("Enter a five numbers: ")
    val n1 = readLine()?.toInt()
    val n2 = readLine()?.toInt()
    val n3 = readLine()?.toInt()
    val n4 = readLine()?.toInt()
    val n5 = readLine()?.toInt()

    val myArray = arrayOf(n1, n2, n3, n4, n5)
    var sum = 0
    for (i in myArray){
        if (i != null) {
            sum += i
        }
    }
    val average = sum / myArray.size

    println("Avrage the numbers is $average")
}

