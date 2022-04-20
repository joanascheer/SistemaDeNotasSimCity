package sistemaDeNotasSimCity

import kotlin.system.exitProcess

fun menuNovoCalculo() {
    println(
        "Cálculo finalizado!\n" +
                "Deseja efetuar um novo cálculo?\n" +
                "1 - SIM | 2 - NÃO",
    )

    when (readln().toInt()) {
        1 -> {
            println("Ok, redirecionando para novo cálculo!\n\n")
        }
        2 -> {
            println("Obrigado(a) por utilizar nosso sistema!\n")
            exitProcess(0)
        }
        else -> {
            println("Digite uma opção válida para continuar.")
            menuNovoCalculo()
        }
    }
}