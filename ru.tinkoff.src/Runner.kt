enum class Sex {
    MALE, FEMALE, UNKNOWN
}

class Pet {
    var nickname: String = ""
    var age: Int = 0
    var sex: Sex? = Sex.UNKNOWN
    override fun toString(): String = "Pet(nickname=$nickname, age=$age, sex=$sex)"
}

fun Pet.isAdult(): Boolean = this.age >= 2

val Pet.respectableNickname: String
    get() = "Dear ${this.nickname}"

fun main() {
    val dog = Pet().apply {
        this.nickname = "Jessie"
        this.age = 1
        this.sex = Sex.FEMALE
    }
    val cat = Pet().apply {
        this.nickname = "Salem"
        this.age = 13
        this.sex = Sex.MALE
    }

    println("${dog.nickname} (age: ${dog.age}) is adult? ${dog.isAdult()}")
    println("${cat.nickname} (age: ${cat.age}) is adult? ${cat.isAdult()}")
    println(dog.respectableNickname)
    println(cat.respectableNickname)
}