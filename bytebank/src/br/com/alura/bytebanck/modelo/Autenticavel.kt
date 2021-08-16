package br.com.alura.bytebanck.modelo

open class Autenticavel {

    var senha: Int = 0
        private set

    fun autentica(senha: Int) : Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}