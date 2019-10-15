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

class Cat : Pet() {
    override fun toString(): String {
        return "Cat(nickname=$nickname, age=$age, sex=$sex)"
    }
}

class Owner<T : Pet>(private val p: T) {
    fun feed() {
        println("Домашнее животное ${p.nickname} накормлено")
    }
}

fun Pet.isAdult(): Boolean = this.age >= 2

fun Dog.isAdult(): Boolean = this.age >= 6

fun main() {
    val dog: Dog = Dog().apply {
        this.nickname = "Jessie"
        this.age = 2
        this.sex = Sex.FEMALE
    }
    val cat: Cat = Cat().apply {
        this.nickname = "Barsik"
        this.age = 2
        this.sex = Sex.MALE
    }
    val catOwner = Owner(cat)
    val dogOwner = Owner(dog)

    catOwner.feed()
    dogOwner.feed()
}