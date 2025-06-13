package Core.ProcessingPart
import Core.menu
import Easter.secret
import Easter.MiniGames.FoundNumber

class ListComandProcess {

    fun escrever(): String{
        var task: String = readln()
        return task
    }

    fun processComand(): String{
        var comand: String = ListComandProcess().escrever()
        if (comand == "/Sad"){
            secret().secretSad()
        }else if(comand == "/Smile"){
            secret().secretSmile()
        }else if(comand == "/NumeroSecreto"){
            FoundNumber().SecretNumber()
        }else if(comand =="/Box"){
            secret().caixaSurpresa()
        }else if(comand =="Amor"){
            secret().coracao()
        }else if(comand =="/Pinguin"){
            secret().pinguim()
        }else if(comand == "/Smiley"){
            secret().smiley()
        }else if(comand == "/Museu"){
            secret().codigoIncrivel()
        }else if(comand == "/Hacker"){
            secret().hackerman()
        }else if(comand == "/Menu"){
            menu().menuView()
        }else if(comand == ""){

        }

        return comand

    }

}