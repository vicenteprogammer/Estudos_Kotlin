fun main(){
    // Question 1
    val nome: String = "Vicente"
    val idade: Int = 15

    println("Meu nome é $nome e tenho $idade anos")

    //Question 2
    println("Enter a number: ")
    val n1 = readLine()?.toInt()
    println("Enter a number: ")
    val n2 = readLine()?.toInt()

    if (n1 != null && n2 != null){
        println("Soma: ${n1 + n2}")
        println("Subtração: ${n1 - n2}")
        println("Multiplicação: ${n1 * n2}")
        if (n2 > 0){
            println("Divisão: ${n1/n2}")
        }else{
            println("Divisão invállida")
        }
    }

    //Question3
    println("Digite o seu nome: ")
    val n = readLine()
    println("Digite a sua idade: ")
    val i = readLine()?.toInt()

    if (i != null){
        println("Olá, $n! Daqui a 5 anos você terá ${i + 5} anos")
    }

    //Question 4
    println("Digite um número: ")
    val nS = readLine()?: "0"
    val nI = nS.toIntOrNull()?:0
    val resultado = nI * 2
    println(resultado)

    //Question 5
    println("Digite a sua idade: ")
    val age = readLine()?.toInt()
    if (age != null){
        if(age >= 18){
            println(true)
        }else{
            println("False")
        }
    }
}