package LauchAplication

import Core.MenuPackage.MainMenu
import Core.addHead
import Core.listView


class launc {
    fun open() {
        print("entra na aplicação?(S/N):")
        val confirm: Char = readln()[0]
        if (confirm == 'S'){
            MainMenu().menuCondicions()
        }


    }
}