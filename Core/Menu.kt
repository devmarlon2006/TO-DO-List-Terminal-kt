package Core
import Core.lista
import Core.ajudarme

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

            if (select == 1){
                lista().addlist()
            }else if(select == 2){
                ajudarme().helpme()
            }else if(select == 3)
                break@mostrarMenu
        }


    }

}
