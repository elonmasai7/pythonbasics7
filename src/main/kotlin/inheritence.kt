open class Wazazi{
     val mama="She likes Cooking"
    val baba="He likes wwtching Manchester United"
}
class boy:Wazazi(){
    fun mvulana(){
        println(baba)
    }

}
class girl:Wazazi(){
    fun msichana(){
        println(mama)
    }

}

fun main(args: Array<String>) {
    val kijanaobjct=boy()
    kijanaobjct.mvulana()
}