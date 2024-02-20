package adr_week_3.ex2

class Employee(var name: String, var jobTitle: String, var salary: Double, ) {
    fun calculateSalary(): Double {
        val number = when(jobTitle.lowercase()) {
            "engineer" -> 2
            "leader" -> 3
            else -> 1
        }
        return number.toDouble() * salary
    }

    fun updateSalary(extraSalary: Double): Double {
        return calculateSalary() + extraSalary
    }
}

fun main() {
    val employee = Employee("Ngoc", "leader", 4000.0)
    println(employee.name)
    println(employee.calculateSalary())
    println(employee.updateSalary(200.0))
}