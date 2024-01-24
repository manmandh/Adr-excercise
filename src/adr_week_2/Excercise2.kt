/*
    Bài 1. Viết hàm và gọi hàm tính tổng các số tự nhiên từ 1 đến n (với n nhập từ bàn phím).
    Yêu cầu viết bằng hàm.
    Bài 2. Viết hàm và gọi hàm tính chu vi, diện tích hình tròn
    (Với mỗi chức năng chu vi và diện tích hình tròn được viết bằng hàm.)
    Bài 3. Viết hàm và gọi hàm in thông tin cá nhân ra màn hình
    Bài 4. Viết hàm và gọi hàm tính tổng bình quân các số nguyên tố và số hoàn hảo từ 1 đến n.
    Với n nhập từ bàn phím. (Với mỗi chức năng viết bằng hàm)
    Bài 5. Viết hàm và gọi hàm kiểm tra giá trị ba cạnh nhập vào từ bàn phím, có phải là ba cạnh
    tam giác hay không ? Loại tam giác gì ? (tam giác đều, cân, thường) ?
    Tính chu vi và diện tích. (Với mỗi chức năng được viết bằng hàm)
 */
package adr_week_2
import java.util.Scanner
import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System. `in`)
    println("Input n: ")

    val n = sc.nextInt();

    val sum = totalSum(n)
    println("Total number from 1 to $n is: $sum")

    val r = getInput("Input r of Circle: ").toDouble()

    val cr = calculateCircumference(r)
    println("Circumference is: $cr")

    val ca = calculateArea(r)
    println("Circle Area is: $ca")

    println("Input n: -- prime && perfect")
    val number = sc.nextInt()
    println("Total prime is: ${calculateAveragePrimeNumber(number)}")
    println("Total perfect is: ${calculateAveragePerfectNumber(number)}")

    printPersonalInformation("Tran Man Man", 18, "Female", "man@mgail.com")

    val a = getInput("Input side a: ").toDouble()
    val b = getInput("Input side b: ").toDouble()
    val c = getInput("Input side c: ").toDouble()

    if(isValidTriangle(a,b,c)){
        val typeTriple = getTriangleType(a,b,c)
        val perimeter = calculatePerimeterTriangle(a,b,c)
        val area = calculateAreaTriangle(a,b,c)

        println("This is triangle: $typeTriple")
        println("Perimeter of this triangle $typeTriple is: $perimeter")
        println("Area of this triangle $typeTriple is: $area")
    }else{
        println("3 sides don't create into triangle")
    }
}

fun totalSum(n: Int) : Int {
    return (1..n).sum()
}

fun getInput(program: String): String{
    println(program)
    return readLine()?:" "
}

fun calculateCircumference(r: Double) : Double {
    return 2* PI * r
}

fun calculateArea(r: Double) : Double{
    return  2*r*r
}


fun isPrimeNumber(number: Int): Boolean {
    var index = 2
    while (index <= sqrt(number.toDouble())) {
        if (number % index == 0) return false
        ++index
    }

    return number >= 2
}

fun isPerfectNumber(number: Int): Boolean {
    var total = 0

    for (index in 1..<number) {
        total += if (number % index == 0) index else 0
    }

    return total == number
}

fun calculateAveragePrimeNumber(number: Int): Double {
    var total = 0.0

    var count = 0

    for (index in 1..number) {
        total += if (isPrimeNumber(index)) index else 0
        count += if (isPrimeNumber(index)) 1 else 0
    }

    return total / count
}

fun calculateAveragePerfectNumber(number: Int): Double {
    var total = 0.0

    var count = 0

    for (index in 1..number) {
        total += if (isPerfectNumber(index)) index else 0
        count += if (isPerfectNumber(index)) 1 else 0
    }

    return total / count
}

fun printPersonalInformation(name: String, age: Int, gender: String, email: String) {
    println("Personal Information:")
    println("Name: $name")
    println("Age: $age")
    println("Gender: $gender")
    println("Email: $email")
}

fun isValidTriangle(side1: Double, side2: Double, side3: Double): Boolean {
    return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1
}

fun getTriangleType(side1: Double, side2: Double, side3: Double): String {
    return when {
        side1 == side2 && side2 == side3 -> "Equilateral"
        side1 == side2 || side1 == side3 || side2 == side3 -> "Isosceles"
        side1*side1 == side2*side2 + side3*side3 || side3*side3 == side2*side2 + side1*side1 || side2*side2 == side1*side1 + side3*side3 -> "Right-angled"
        else -> "Scalene"
    }
}

fun calculatePerimeterTriangle(side1: Double, side2: Double, side3: Double): Double {
    return side1 + side2 + side3
}

fun calculateAreaTriangle(side1: Double, side2: Double, side3: Double): Double {
    val p = calculatePerimeterTriangle(side1, side2, side3) / 2
    return sqrt(p * (p - side1) * (p - side2) * (p - side3))
}
