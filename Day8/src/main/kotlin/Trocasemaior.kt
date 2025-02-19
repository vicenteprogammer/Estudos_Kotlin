fun main(){
    println("Digite um número")
    var a = readLine()?.toInt()
    println("Digite outro número: ")
    var b = readLine()?.toInt()

    if (a != null && b != null){
        var temp = 0
        if (a < b){
            temp = a
            a = b
            b = temp
            println("$a e $b")
        }else{
            println("$a e $b")
        }
    }
}