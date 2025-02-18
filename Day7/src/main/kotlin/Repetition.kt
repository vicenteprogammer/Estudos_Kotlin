fun main(){
    //question 1
    println("Digite um número: ")
    val n = readLine()?.toInt()
    if(n != null){
        for (i in 1..n){
            println(i)
        }
    }
    //question 2
    println("Digite um número: ")
    val n1 = readLine()?.toInt()
    for (i in 1..10){
        if (n1 != null) {
            println("$n1 x $i = ${n1 * i}")
        }
    }
    //questão 3
    println("Digite um número: ")
    val n2 = readLine()?.toInt()
    if (n2 != null){
        for (i in 1..n2){
            if (i % 2 != 0){
                println(i)
            }
        }
    }
    //question 4

    val nS = 3
    println("Tente acertar o número de 1 a 10!!!")
    do {
        println("Seu palpiute: ")
        val t = readLine()?.toInt()
        if (t != null){
            when{
                t > nS -> println("O numero é menor que esse")
                t < nS -> println("O número e maior que esse")
                t == nS -> println("Acertou miseravi")
            }
        }
    }while (nS != t)

   //question 5
    do {
        println("Digita meu caro: ")
        val nZ = readLine()?.toInt()
    }while(nZ != 0)

}