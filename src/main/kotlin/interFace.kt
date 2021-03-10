interface Maquina {
    fun ligar()
    fun desligar() {
        println("off")
    }
}
class Computador() : Maquina {
    override fun ligar() {

    }
}
interface interface1 {
    fun ola(){
        println("interface1")
    }
}
interface interface2 {
    fun ola()
}
class ImplementaInterface : interface1, interface2 {
    override fun ola() {
        super<interface1>.ola()
    }
}
fun main(){
    
}