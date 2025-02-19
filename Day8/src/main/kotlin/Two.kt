fun main(){
    println("Digite um número: ")
    val n = readLine()?.toInt()

    if(n != null){
        if ((n % 2 == 0)){
            println("Número par")
        }else{
            println("Número ímpar")
        }
    }
}