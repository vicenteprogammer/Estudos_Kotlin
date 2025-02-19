fun main(){
    println("Seu nome: ")
    val n = readLine()
    println("Seu salário: ")
    val s = readLine()?.toInt()
    println("Seu total de venda: ")
    val tV = readLine()?.toDouble()
    var salB = 0.0
    var com = 0.0
    if (n != null && s != null && tV!= null){
        com = tV * 0.15
        salB = s + com
        println("O senhor $n contabilizou $tV R$ em vendas. Seu salário base é de $s .A com de 15% sobre as vendas corresponde a $com. Seu sal B é $salB")
    }
}