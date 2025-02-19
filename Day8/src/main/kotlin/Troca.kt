fun main(){
    println("A :")
    var a = readLine()?.toInt()
    println("B : ")
    var b = readLine()?.toInt()
    var temp = 0
    if (a != null) {
        temp = a
    }
    a = b
    b = temp

    println(" $a e $b")

}