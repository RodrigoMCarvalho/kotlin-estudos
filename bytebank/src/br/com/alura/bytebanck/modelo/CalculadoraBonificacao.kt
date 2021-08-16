package br.com.alura.bytebanck.modelo

class CalculadoraBonificacao {

    var total = 0.0
        private set

    // teste com Any e cast
    fun registra(funcionario: Any) {
        if (funcionario is Funcionario)  //"as" faz o cast e "is" faz o smart cast e verifica
        this.total += funcionario.bonificacao
    }

    fun registra(funcionario: Funcionario) {
            this.total += funcionario.bonificacao
    }

}