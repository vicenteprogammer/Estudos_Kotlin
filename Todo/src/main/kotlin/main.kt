fun main(){
    val tasks: MutableList<String> = mutableListOf()
    var op: Int

    while(true){
        println("""
        --- TO DO ---
        --- Menu ---
        1 - Adiconar Tarefa
        2 - Remover Tarefa
        3 - Ver tarefas
        4 - Sair
    """.trimIndent()
        )
                println("O que você deseja?")
                op = readLine()?.toIntOrNull()!!

            when(op){
            1 ->{
            println("Qual tarefa para ser adicionada?")
            val task = readLine().toString()
            if (!tasks.contains(task)){
                tasks.add(task)
                println("A tarefa $task, foi adiconada om sucesso")
            }
            else{
                println("Tarefa não adicionada, pois já existe")
            }
        }
            2 -> {
                println("Qual tarefa você quer remover?")
                val task = readLine().toString()
                if (tasks.contains(task)){
                    tasks.remove(task)
                    println("Tarefa excluida")
                }else{
                    println("Essa tarefa não existe")
                }
            }

            3 ->{
                if (tasks.isEmpty()){
                    println("Você não tem nenhuma tarefa adicionada!!!")
                }
                else{
                    tasks.forEach{task ->
                        println(task)
                    }
                }
            }

            4 ->{
            println("Saindo")
                break
        }
        }
    }
}