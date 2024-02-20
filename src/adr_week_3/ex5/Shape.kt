package adr_week_3.ex5

import kotlin.math.PI
import kotlin.math.sqrt

interface Shape {
    fun getArea(): Double
}

class Triangle(var side1: Double, var side2: Double, var side3: Double): Shape {
    override fun getArea(): Double {
        val parameter = side1 + side2 + side3
        return sqrt(parameter * (parameter - side1) * (parameter - side2) * (parameter - side3))
    }

}

class Circle(var radius: Double): Shape {
    override fun getArea(): Double {
        return PI * radius * radius
    }
}

class Rectangle(var width: Double, var height: Double): Shape {
    override fun getArea(): Double {
        return width * height
    }
}