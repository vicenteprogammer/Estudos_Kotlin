
class Funcionario(
    nome: String,
    age: Int,
    val sal: Double
): Pessoa(nome, age) {
    fun mostraSal(){
        println("Olá meu nome é $nome e ganho $sal")
    }
}