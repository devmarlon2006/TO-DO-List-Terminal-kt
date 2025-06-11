package Easter.MiniGames

import kotlin.random.Random

class FoundNumber(){

    fun SecretNumber() {
        val NumSecret: Int = Random.nextInt(1, 101)
        val play: Boolean = true


        game@ while (play) {
            println("Estou pensando em um número entre 1 e 10. Qual você acha que é?:")
            var NumEscolhido: Int = readln().toInt()

            if (NumEscolhido > NumSecret) {
                println("O numero e menor!Tenta de novo")
                continue@game
            } else if (NumEscolhido < NumSecret) {
                println("O numero e maior!Tenta de novo")
                continue@game
            } else if (NumEscolhido == NumSecret) {
                println("Numero Correto!!")
                break@game
            }
        }
    }

    fun iThink(){

    }
}