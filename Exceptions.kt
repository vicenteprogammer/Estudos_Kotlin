fun main(){
    val input = try {
        readLine()?.toInt()
    }catch (e : NumberFormatException){
        0
    }
    println("You entered: $input")

    divide(2.0, 0.0)
}
class DivisionByZero : Exception("Não podemos divider po zero menor")
fun divide(a : Double, b: Double): Double{
    if(b == 0.0){
        throw DivisionByZero()
    }else {
        return a / b
    }
}