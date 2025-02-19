fun main(){
    var i = 0
    var a = 0
    var b = 0
    var c = 0
    while (i < 10){
        println("Qual vc pega? A[1] B[2] C[3]")
        val elevator = readLine()?. toInt()
        if (elevator != null ){

            if (elevator == 1){
                a += 1
            }else if(elevator == 2){
                b += 1
            }else{
                c += 1
            }
        }
        i++
    }
    println("A -> $a pessoas / B -> $b pessoas / C -> $c pessoas")
}