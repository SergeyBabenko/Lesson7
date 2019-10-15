enum class Sex {
    MALE, FEMALE, UNKNOWN
}

open class Pet {
    var nickname: String = ""
    var age: Int = 0
    var sex: Sex? = Sex.UNKNOWN
    override fun toString(): String = "Pet(nickname=$nickname, age=$age, sex=$sex)"
}

class Dog : Pet() {
    override fun toString(): String {
        return "Dog(nickname=$nickname, age=$age, sex=$sex)"
    }
}

fun Pet.isAdult(): Boolean = this.age >= 2

fun Dog.isAdult(): Boolean = this.age >= 6

fun main() {
    val dog: Pet = Dog().apply {
        this.nickname = "Jessie"
        this.age = 2
        this.sex = Sex.FEMALE
    }
    val niceDog: Dog = Dog().apply {
        this.nickname = "Rex"
        this.age = 2
        this.sex = Sex.MALE
    }

    println("${dog.nickname} (age: ${dog.age}) is adult? ${dog.isAdult()}")
    println("${niceDog.nickname} (age: ${niceDog.age}) is adult? ${niceDog.isAdult()}")
}