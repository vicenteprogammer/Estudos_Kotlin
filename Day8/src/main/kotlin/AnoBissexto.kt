fun main(){
    println("Digite um ano: ")
    val a = readLine()?.toInt()
    if (a != null){
        if ( a % 4 == 0){
            println("O ano $a é bissexto ")
        }else{
            println("O ano $a não é bissexto")
        }
    }
}