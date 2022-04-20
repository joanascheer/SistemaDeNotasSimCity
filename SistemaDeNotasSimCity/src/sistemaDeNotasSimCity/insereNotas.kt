package sistemaDeNotasSimCity

fun insereNotas(listaNotas: DoubleArray) : DoubleArray {

    println("*** Inserção de notas ***\n")

    for (i in listaNotas.indices) {
        println("Digite a ${i+1}a nota do aluno: ")
        val nota = readln().toDouble()
        if (nota in 0.0..10.0) {
            listaNotas[i] = nota
        } else {
            println("A nota digitada é inválida.\n" +
                    "Insira uma nota válida para continuar\n")
            break
        }
    }

    println("*** Notas inseridas ***\n")
    for (i in listaNotas.indices) {
        println("${i + 1}a nota: ${listaNotas[i]}")
    }

    println("Confira se estão todas corretas para continuar.\n" +
            "Deseja corrigir as notas inseridas?\n" +
            "1 - SIM | 2 - NÃO\n")
    val corrige = readln().toInt()

    if (corrige == 1) {
        alteraNota(listaNotas)
    } else if (corrige == 2) {
        menuPrincipal(listaNotas)
    } else {
        println("Opção inválida.")
    }

    return listaNotas

}