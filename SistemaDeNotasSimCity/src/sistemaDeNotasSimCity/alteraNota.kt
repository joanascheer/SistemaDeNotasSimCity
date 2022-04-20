package sistemaDeNotasSimCity

fun alteraNota(listaNotas: DoubleArray) {

    for (i in listaNotas.indices) {
        println("Que nota deseja alterar?\n" +
                "1 - primeira nota\n" +
                "2 - segunda nota\n" +
                "3 - terceira nota\n" +
                "4 - quarta nota")
        val notaAAlterar = readln().toInt()

        if (notaAAlterar == 1) {

            println("Digite o valor correto: ")
            val novaNota = readln().toDouble()
            listaNotas[0] = novaNota

            println("Sua primeira nota agora é ${listaNotas[0]}\n")
            println("Lista de notas atualizada:\n")
            for (j in listaNotas.indices) {
                println("${j + 1}a nota: ${listaNotas[j]}")
            }

            println("Deseja fazer mais alguma alteração?\n" +
                    "1 - SIM | 2 - NÃO")
            val alteracao = readln().toInt()

            if (alteracao == 1) {
                alteraNota(listaNotas)
            } else if (alteracao == 2) {
                menuPrincipal(listaNotas)
            }

        } else if (notaAAlterar == 2) {

            println("Digite o valor correto: ")
            listaNotas[1] = readln().toDouble()

            println("Sua segunda nota agora é ${listaNotas[1]}\n")
            println("Lista de notas atualizada:\n")
            for (j in listaNotas.indices) {
                println("${j + 1}a nota: ${listaNotas[j]}")
            }

            println("Deseja fazer mais alguma alteração?\n" +
                    "1 - SIM | 2 - NÃO")
            val alteracao = readln().toInt()

            if (alteracao == 1) {
                alteraNota(listaNotas)
            } else if (alteracao == 2) {
                menuPrincipal(listaNotas)
            }

        } else if (notaAAlterar == 3) {

            println("Digite o valor correto: ")
            listaNotas[2] = readln().toDouble()

            println("Sua terceira nota agora é ${listaNotas[2]}\n")
            println("Lista de notas atualizada:\n")
            for (j in listaNotas.indices) {
                println("${j + 1}a nota: ${listaNotas[j]}")
            }

            println("Deseja fazer mais alguma alteração?\n" +
                    "1 - SIM | 2 - NÃO")
            val alteracao = readln().toInt()

            if (alteracao == 1) {
                alteraNota(listaNotas)
            } else if (alteracao == 2) {
                menuPrincipal(listaNotas)
            }

        } else if (notaAAlterar == 4) {

            println("Digite o valor correto: ")
            listaNotas[3] = readln().toDouble()

            println("Sua quarta nota agora é ${listaNotas[3]}\n")
            println("Lista de notas atualizada:\n")
            for (j in listaNotas.indices) {
                println("${j + 1}a nota: ${listaNotas[j]}")
            }

            println("Deseja fazer mais alguma alteração?\n" +
                    "1 - SIM | 2 - NÃO")
            val alteracao = readln().toInt()

            if (alteracao == 1) {
                alteraNota(listaNotas)
            } else if (alteracao == 2) {
                menuPrincipal(listaNotas)
            }
        }

    }
}