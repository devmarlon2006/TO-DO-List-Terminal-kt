package Core
import Util.numtask
import Util.adicionar
import Core.ProcessingPart.ListComandProcess
import Easter.secret

class lista (){

    fun ta(): String{
        var task: String = readln()
        return task
    }

    fun addlist(){
        print("Digite '/Continue' para daicionar uma tarefa:")
        val contask: String = readln()
        var task: String = ""

        repetir@while(adicionar) {
            if (contask == "/Continue") {
                print("$numtask.")
                ListComandProcess().processComand()
                numtask++
                continue@repetir

            } else if (contask == "/Exit") {
                break@repetir
            }else{
                continue@repetir
            }
        }
    }

}



