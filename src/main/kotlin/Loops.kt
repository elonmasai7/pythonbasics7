fun main(args: Array<String>) {
//    this is a for loop

    for (i in 5..12){
        println("Loop : $i")
    }
    val myarr= arrayOf("ab","be","cd","ef","gh",2.45)

    for (n in myarr){
        println(n)
    }
//    tthis is a while loop
    var num =10
    var num2=0
    var num3=100
    while (num>=0){
        println("Loop : $num")
        num--
    }
    do {
        println("Loop: $num3")
        num3++
    } while (num3<=105)
}