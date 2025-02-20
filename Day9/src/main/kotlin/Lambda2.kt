fun main(){
    var list = (1..10).toList()
    val sum =list.customSum { it % 2 == 1 }
    println(sum)

}

fun List<Int>.customSum(filterFunction: (Int) -> (Boolean) ): Int {
    var resultList = 0
    for (sum in this){
        if (filterFunction(sum)){
            resultList += sum
        }
    }
    return resultList
}

class Sum