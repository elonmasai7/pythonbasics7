class Students(val name:String,var gender:String,val age:Int){

}

fun main(args: Array<String>) {
   //this  is an object
    val myobj=Students("Erick","Male",50)

    println("Student Name is ${myobj.name} and he is ${myobj.gender} of ${myobj.age} years old")
}