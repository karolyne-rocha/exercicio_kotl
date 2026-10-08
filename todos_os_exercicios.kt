fun main() {
    val precoOriginal = 100.0

    println(calcularDesconto(precoOriginal, "PROMO10"))
    println(calcularDesconto(precoOriginal, "PROMO20"))
    println(calcularDesconto(precoOriginal, null))
}

fun calcularDesconto(valor: Double, cupom: String?): Double {
    when (cupom) {
        "PROMO10" -> return valor - 10.0
        "PROMO20" -> return valor - 20.0
        else -> return valor
    }
}


2-
  
fun main() {
    val lista = listOf("Rua A, 123", null, "Avenida B, 456", null)

    for (endereco in lista) {
        val enderecoFinal = endereco ?: "Endereço Desconhecido"

        if (enderecoFinal == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoFinal")
        }
    }
}

3- 
  
fun main() {
    val bio1 = "Adoro assistir filmes de comédia."
    val bio2 = null

    validarBioInfantil(bio1)
    validarBioInfantil(bio2)
}

fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

4- 

  fun main() {
    val transacoes = listOf<Double?>(50.0, null, 120.5, null, 10.0)
    var total = 0.0

    for (t in transacoes) {
        if (t != null) {
            total += t
        } else {
            println("Transação ignorada")
        }
    }

    println("Valor total processado: $total")
}


  5- 


fun main() {
    avaliarMotorista(5)
    avaliarMotorista(2)
    avaliarMotorista(null)
}

fun avaliarMotorista(nota: Int?) {
    val notaFinal = nota ?: 0

    when (notaFinal) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
        else -> println("Nota inválida.")
    }
}


6-

  fun main() {
    val calcularGorjeta: (Double?) -> Double = {
        if (it == null || it < 0.0) {
            0.0
        } else {
            it
        }
    }

    println(calcularGorjeta(15.0))
    println(calcularGorjeta(-5.0))
    println(calcularGorjeta(null))
}
