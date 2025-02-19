fun main(){
    println("Qual o preço de fánrica do seu carro: ")
    val pF = readLine()?.toDouble()
    if (pF != null){
        var pC = 0.0
        val icms =  pF * 0.12
        val ipi = pF * 0.11
        val pis = pF * 0.0165
        val cofins = pF * 0.076

        pC = pF + ipi + icms + pis + cofins
        pC = pC + (pC * 0.28)

        println("Preço do seu carro: $pC")

    }
}