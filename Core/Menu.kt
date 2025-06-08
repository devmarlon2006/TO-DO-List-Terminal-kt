package Core

class menu (){

    fun menuView (){

        var running = true

        mostrarMenu@while (running) {
            println("\n--- MENU ---")
            println("1. Open List")
            println("2. help-me")
            println("3. exit")
            print("Enter your choice: ")
        }
    }

}
