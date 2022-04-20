package sistemaDeNotasSimCity

import kotlin.system.exitProcess

fun menuPrincipal(listaNotas: DoubleArray) {

    while (true) {
        println("***************************\n" +
                "ESCOLA CATALISA DE SIM CITY\n" +
                "             *             \n" +
                "Sistema de Cálculo de Notas\n" +
                "***************************\n")

        println("1 - Inserir notas das avaliações")
        println("2 - Alterar nota inserida")
        println("3 - Calcular média semestral")
        println("4 - Sair do sistema\n")

        println("Digite a opção desejada: ")

        when (readln()) {

            "1" -> {
                insereNotas(listaNotas)

            }
            "2" -> {
                alteraNota(listaNotas)
            }
            "3" -> {
                calculaMediaSemestral(listaNotas)

            }
            "4" -> {
                println("Obrigado(a) por utilizar nosso sistema!")
                exitProcess(0)
            }
        }
    }

}