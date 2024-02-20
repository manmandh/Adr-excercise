package adr_week_3.ex4

open class Vehicle(var make: String, var model: String, var year: Int, var fuelType: String) {
    open fun displayInformation(){
        println("")
    }
}

class Truck(val size: Double, val seat: Int) : Vehicle("Run", "GM 18.470", 2000 , "Oil" ) {
    override fun displayInformation(){

    }
}

class Car(val size: Double, val seat: Int) : Vehicle("Run", "May bach", 2020, "gasoline") {

}

class Motorcycle(val size: Double, val seat: Int) : Vehicle("Run", "SH", 1995, "gasoline") {

}