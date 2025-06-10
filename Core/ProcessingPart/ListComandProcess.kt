package Core.ProcessingPart
import Core.lista
import Easter.secret

class ListComandProcess {

    fun processComand(): String{
        var comand: String = lista().ta()

        if (comand == "/Sad"){
            secret().secretSad()
        }else if(comand == "/Smile"){
            secret().secretSmile()
        }
        return comand

    }

}