// Parent class
open class Animal(val name: String) {
    open fun eat() {
        println("$name is eating.")
    }
}

// Child class
class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name is eating dog food.")
    }
    fun bark() {
        println("$name is barking.")
    }
}

// Child class
class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name is eating cat food.")
    }
    fun meow() {
        println("$name is meowing.")
    }
}

fun main() {
    val dog = Dog("Buddy")
    dog.eat()
    dog.bark()

    val cat = Cat("Whiskers")
    cat.eat()
    cat.meow()
}
