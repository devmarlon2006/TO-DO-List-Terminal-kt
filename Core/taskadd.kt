package Core
import Util.numtask
import Util.adicionar
import Easter.snake

class lista (){

    fun addlist(): String{
        print("Digite '/Continue' para daicionar uma tarefa:")
        val contask: String = readln()
        var task: String = ""

        repetir@while(adicionar) {
            if (contask == "/Continue") {
                var task: String = readln()
                if(task == "/Snake"){
                    task = snake()
                }
                print("$numtask.")
                numtask++
                continue@repetir

            } else if (contask == "/Exit") {
                break@repetir
            }
        }
        return task
    }

}



