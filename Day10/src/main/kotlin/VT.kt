fun main(){
    var idade = 25
    idade += 5

    println("Digite um núemero: ")
    val n = readLine()?.toInt()
    if (n != null ){
        if (n % 2 == 0){
            println("Número Par")
        }else
        {
            println("Núemro ímpar")
        }

        when{
            n < 0 -> println("Negativo")
            n == 0 -> println("Zero")
            n > 0 -> println("Positivo")
        }
    }

    for (i in 1..10){
        println(i)
    }

    val sum = sum(2,4)
    println(sum)

    saud("Vicente")
}

fun sum(x: Int, y : Int): Int{
    var sum = 0
    sum = x + y
    return sum
}


fun saud(name: String){
    println("Olá $name, tudo bem?")
}