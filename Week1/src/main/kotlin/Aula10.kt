fun main(){
    println("Enter a your age: ")
    val age = readLine()?.toInt()

    if (age != null) {
        if (age >= 0 && age <= 12){
            println("You are children")
        }else if(age > 12 && age <= 18){
            println("You young")
        }else if(age > 18 && age <60){
            println("You are adult")
        }else{
            println("You really really old")
        }
    }
}