fun main(){
    println("Digite o seu nome: ")
    val n = readLine()
    println("Digite a sua idade: ")
    val age = readLine()?.toInt()
    println("Oi, $n você tem $age anos")
}