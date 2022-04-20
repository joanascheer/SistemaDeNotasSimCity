package sistemaDeNotasSimCity

fun calculaMediaSemestral(listaNotas: DoubleArray) : Double {
    var soma = 0.0

    for (i in listaNotas.indices) {
        soma += listaNotas[i]
    }

    val media = soma / 4
    println("A média semestral do seu aluno é: $media")

    menuNovoCalculo()
    return media

}