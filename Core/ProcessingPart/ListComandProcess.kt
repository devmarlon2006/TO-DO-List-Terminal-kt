package Core.ProcessingPart
import Core.lista
import Easter.secret
import Easter.MiniGames.FoundNumber

class ListComandProcess {

    fun processComand(): String{
        var comand: String = lista().ta()

        if (comand == "/Sad"){
            secret().secretSad()
        }else if(comand == "/Smile"){
            secret().secretSmile()
        }else if(comand == "/NumeroSecreto"){
            FoundNumber().SecretNumber()
        }
        return comand

    }

}