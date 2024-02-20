package adr_week_3.ex1
class Rectangle(val width: Int, val height: Int) {
    fun getArea(){
        val s = width * height;
        println("Area of Rectangle is: $s")
    }
    fun getPerimeter(){
        val c = (width+height)*2
        println("Perimeter of Rectangle is: $c")
    }
}

