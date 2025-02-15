fun main(){
   // println("Enter a number: ")
   // var n = readLine()?.toInt()
   // val i = 0
    //println("Number $n down to 0:")
  //  if (n != null){
   //    while(n > i - 1 ){
    //        println(n)
    //        n--
      //  }
   // }

    println("Enter a number 1: ")
    var n1 = readLine()?.toInt()
    println("Enter number 2: ")
    val n2 = readLine()?.toInt()

    var i = 0
    var result = 1

    if (n1 != null && n2 != null){
        while(i < n2){
            result *= n1
            i++
        }
    }
    println(result)




}