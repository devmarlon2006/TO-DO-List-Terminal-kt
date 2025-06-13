package Core
import Core.lista
import Core.ajudarme

val confirm: Char = '\u0000'

class menu (){

    fun menuView (){

        var running = true

        mostrarMenu@while (running) {
            println("\n--- MENU ---")
            println("1. Open List")
            println("2. help-me")
            println("3. exit")
            print("Enter your choice: ")
            var select: Int = readln().toInt()

            if (select == 1) {
                lista().addlist()

            } else if (select == 2) {
                ajudarme().helpme()
                break@mostrarMenu

            } else if (select == 3) {
                print("Exit s/n:")
                val confirm: Char = readln()[0]
                if (confirm == 's') {
                    break@mostrarMenu

                } else if (confirm == 'n') {
                    continue@mostrarMenu

                } else {
                    println("Invalid 'char'")
                    continue@mostrarMenu
                }

            }else{
                print("invalid")
                continue@mostrarMenu
            }
        }
    }
}
