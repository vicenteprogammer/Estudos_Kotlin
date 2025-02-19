fun main(){
    println("Nome do produto: ")
    val nP = readLine()?: "Sem produto"
    println("Valor de compra: ")
    val nC = readLine()?.toDouble()
    var vV = 0.0
    if (nC != null){
        vV = nC + (nC * 0.20)
        println("O valor de venda do produto é $vV")
    }
}