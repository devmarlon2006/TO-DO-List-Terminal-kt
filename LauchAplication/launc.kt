package LauchAplication

import Core.listView


class launc {
    fun open() {
        print("entra na aplicação?(S/N):")
        val confirm: Char = readln()[0]
        if (confirm == 'S'){
            listView().mostrar()
        }


    }
}