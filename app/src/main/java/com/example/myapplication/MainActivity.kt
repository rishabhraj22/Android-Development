fun main() {
    // Using 'var': Mutable variable
    var mutableValue = 10
    println("Initial value of mutableValue: $mutableValue")

    // Changing the value of the 'var' variable
    mutableValue = 20
    println("Updated value of mutableValue: $mutableValue")

    // Using 'val': Immutable variable
    val immutableValue = 30
    println("Value of immutableValue: $immutableValue")

    // Uncommenting the below line will cause a compilation error because 'val' cannot be reassigned
    // immutableValue = 40

    // Demonstrating immutability with val using collections
    val immutableList = listOf(1, 2, 3)
    println("Immutable List: $immutableList")

    // While you can't reassign 'immutableList', you cannot add/remove elements either
    // immutableList.add(4) // This would cause an error

    // Mutable collections with var
    var mutableList = mutableListOf(4, 5, 6)
    println("Initial Mutable List: $mutableList")
    mutableList.add(7) // Adding elements is allowed
    println("Updated Mutable List: $mutableList")
}
