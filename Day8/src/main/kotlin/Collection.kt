fun main(){
    val list = mutableListOf("Vicente", "De Paula", "Leite", "Carvalho")
    list.add("Jordan")
    list.remove("Leite")
    println(list)

    val produtos = mutableMapOf("Maçã" to 10, "Pera" to 3, "Uva" to 10)
    produtos["Maça"] = 15
    produtos["Laranja"] = 10
    println(produtos)

    val numbers = mutableListOf(1,2,3,54,5,6,3,212,34)
    val maisque = numbers.filter { it > 10 }
    val multi = numbers.map { it * 2 }
    val par = numbers.find { it % 2 == 0 }
    println(par)
}