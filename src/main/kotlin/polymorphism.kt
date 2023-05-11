//parent/superclasses
open class Shape{
    open fun draw(){
        println("Drawing Shape")
    }
//   child/sub classes
}class Circle:Shape(){
    override fun draw() {
        println("Drawing a Circle")
    }

}
class Square:Shape(){
    override fun draw() {
        println("Drawing asquare")
    }
}
class Triangle:Shape(){
    override fun draw() {
        println("Draw a Triangle")
    }

}

fun main(args: Array<String>) {
    val shapes:Array<Shape> = arrayOf(Circle(),Square(),Triangle())
    for (shape in shapes){
        shape.draw()
    }
}