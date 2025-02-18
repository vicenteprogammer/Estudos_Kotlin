fun main(){
    //question 1
    println("Digite um número: ")
    val n = readLine()?.toInt()
    if (n != null){
        if(n % 2 == 0){
            println("Número par")
        }else{
            println("Número Impar")
        }
    }
    //question 2
    println("Digite três números: ")
    val n1 = readLine()?.toInt()
    val n2= readLine()?.toInt()
    val n3 = readLine()?.toInt()
    if (n1 != null && n2 != null && n3 != null){
        if (n1 > n2 && n1 > n3){
            println("$n1 é o mair")
        }else if(n2 > n1 && n2 > n3){
            println("$n2 é maior")
        }else{
            println("$n3 é o maior")
        }
    }
    //question 3
    println("Digite a sua nota: ")
    val nota = readLine()?.toInt()
    if (nota != null){
        when(nota){
            9, 10 -> println("Excelente")
            7, 8 -> println("Bom")
            5, 6 -> println("Precisa melhorar")
            in 0..4 -> println("Reprovado")

        }
    }
    //question 4
    println("Digite a sua idade: ")
    val ida = readLine()?.toInt()
    if ( ida != null){
        if (ida >= 18){
            println("Pode tirar a carteira: ")
        }else{
            val f = 18 - ida
            println("Ainda falkat $f anos para você tirar a sua carteira")

        }
    }
    println("Digite dois núemros: ")
    val n4 = readLine()?.toInt()
    val n5 = readLine()?.toInt()
    println(
        """
        Qual opção vai escolher?
        1 -> adição
        2 -> subtração
        3 -> multiplicação
        4 -> Divisão
    """.trimIndent()
    )
    val op = readLine()?.toInt()

    if (n4 != null && n5 != null && op != null){
        when(op){
            1 -> println(n4 + n5)
            2 -> println(n4 - n5)
            3 -> println(n4 * n5)
            4 ->{
                if (n5 != 0){
                    println(n4 / n5)
                }else{
                    println("Divisão Inválida")
                }
            }
        }
    }
}