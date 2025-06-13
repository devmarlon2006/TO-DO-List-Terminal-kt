package Core
import Util.adicionar

class ajudarme{

    fun helpme() {

        println("1.Voltar")
        println("2.Lista de comandos")
        print("Enter you choice:")
        val selector: Int = readln().toInt()

        agg@while (adicionar) {
            if (selector == 1) {
                menu().menuView()
                break@agg
            } else if (selector == 2) {
                list().listComandView()
                break@agg

            }


        }
    }
}

