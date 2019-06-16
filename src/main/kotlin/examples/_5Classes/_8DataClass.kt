package examples._5Classes

// Adding data makes the compiler generate useful methods
// such as equals, hashCode, toString, copy.
data class Contact(val name: String, var address: String)

fun main() {
    val contact = Contact("Harry Potter", "4 Privet Drive")
    val contact2 = Contact("Harry Potter", "4 Privet Drive")
    println(contact)
    println(contact == contact2)

    contact.copy(address = "Hogwarts")
}