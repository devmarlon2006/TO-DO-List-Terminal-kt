package LauchAplication

import Core.menu

class launc {
    fun open() {
        print("entra na aplicação?(S/N):")
        val confirm: Char = readln()[0]

        if (confirm == 'S')
        menu().menuView()
    }
}