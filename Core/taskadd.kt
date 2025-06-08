package Core
import Util.numtask
import Util.adicionar
import Easter.secret

class lista (){

    fun addlist(){
        print("Digite '/Continue' para daicionar uma tarefa:")
        val contask: String = readln()
        var task: String = ""

        repetir@while(adicionar) {
            if (contask == "/Continue") {
                var task: String = readln()
                    if(task == "/Smile"){
                       task = secret().secretSmile()
                    }else if(task == "/Sad"){
                       task = secret().secretSad()
                    }
                print("$numtask.")
                numtask++
                continue@repetir

            } else if (contask == "/Exit") {
                break@repetir
            }
        }
    }

}



