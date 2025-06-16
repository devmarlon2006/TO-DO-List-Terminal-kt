package Core.MenuPackage

import Core.addHead
import Core.listView

class MainMenu {
    fun mainMaenuview(): String{
        println("1.Nova lista")
        println("2.Listas")
        println("3.Help")
        println("4.Sair")
        val confirmCase: String = readln()
        return confirmCase
    }

    fun menuCondicions(){
        if (mainMaenuview() == "1"){
            addHead()
        }
    }
}