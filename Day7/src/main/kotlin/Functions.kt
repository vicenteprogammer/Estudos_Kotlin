fun main(){
    multiplicar(2, 3)
    calcular(2,2,5)
    maior(2)
    parI(2)
    fat(5)
    fibonnacci(10)
    val nameList = listOf("EU", "TU", "NÓS", "ELES")
    val resultado = concS(nameList)
    println(resultado)
}
//Question 1
fun multiplicar(x: Int, y : Int): Int{
    return (x * y)
}
//Question 2
fun calcular(x: Int, y : Int, op: Int) {
    when{
        op ==1 -> print("Soma: ${x + y}")
        op == 2 -> print("Soma: ${x - y}")
        op == 3 -> print("Soma: ${x * y}")
        op == 4 -> {
            if (y != 0){
                print("Soma: ${x + y}")
            }else{
                println("Divisão Inavalida")
            }
        }
        op > 4 -> println("Opção invalida")
        op <= 0 -> println("Opção invalida")
    }
}

//Question 3

fun maior(idade: Int){
    if (idade >=  18){
        println("Maior de idade")
    }else{
        println("Menor de idade")
    }

}

//Questão 4
fun parI(n : Int){
    if (n %2 == 0){
        println("Número Par")
    }else{
        println("Número ìmpar")
    }
}

//Question 5
fun fat(n: Int){
    var result = 1
    for (i in 2..n){
        result *= i
    }
    println(result )
}
//Question 6
fun fibonnacci(n: Int){
    var n1 = 0
    var n2 = 1
    var n3 = 0
    for (i in 0..n){
        println(n3)
        n3 = n1 + n2
        n1 = n2
        n2 = n3
    }
}
//Question 7
fun concS(list: List<String>):String{
    return list.joinToString { "," }
}