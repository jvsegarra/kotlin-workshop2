package traits


// TODO: [traits] Declare a Customer Repository as a trait with methods getAll and findByName
public interface customerRepository {
    fun getAll() = println("getAll")
    fun findByName() = println("findByName")
}