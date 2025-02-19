fun main(){
    println("Qual a distância percorrida: ")
    val d = readLine()?.toDouble()
    println("Total de combustível gasto: ")
    val c = readLine()?.toDouble()
    var cm = 0.0
    if (d != null && c != null){
        cm = d / c
        println("O consumo médio foi de: $cm KM/L")
    }
}