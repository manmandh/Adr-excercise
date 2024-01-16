import kotlin.math.sqrt

//1. Giải phương trình bặc 1 & 2
//2. Nhập 1 tháng, cho biết tháng đó quý mấy
//3. Tính tống các số tự nhiên từ 1 đến n
//4. Tính n! gia thừa

fun main(args: Array<String>) {
    print("Input a: ")
    val a = readLine()?.toDoubleOrNull()

    if(a==null){
        println("Not valid")
        return
    }

    print("Input b: ")
    val b = readLine()?.toDoubleOrNull()
    if(b==null){
        println("Not valid")
        return
    }

    print("Input c: ")
    val c = readLine()?.toDoubleOrNull()
    if(c==null){
        println("Not valid")
        return
    }
    solve(a,b,c)

    println("Input n: ")
    val number = readLine()?.toIntOrNull()
    if(number == null || number >= 12 || number <= 0){
        println("Not valid")
    }

    solve2(number)

    println("Input n")
    val n = readLine()?.toIntOrNull()
    print("Total number from 1 to 100 is: ")
    if (n != null) {
        solve3(n)
    }

    println("Input number factorial: ")
    val f = readLine()!!.toInt()
    if (f >= 0) {
        val result = factorial(f)
        println("The factorial of $f is $result")
    } else {
        println("Invalid input: Please enter a integer.")
    }
}

fun solve(a:Double, b:Double,c:Double){
    val delta = b*b - 4*a*c;
    if(delta<0){
        println("Phuong trinh vo nghiem")
    }else if(delta == 0.0){
        val x = -b/(2*a)
        print("Phuong trinh co nghiem x1=x2= $x")
    }else{
        var delta = sqrt(delta);
        var x1 = (-b + delta)/(2*a)
        var x2 = (-b - delta)/(2*a)
        println("Phuong trinh co hai nghiem x1=$x1 va x2=$x2")
    }
}

fun solve2(number: Int?){
    when(number){
        in 1..3 -> println("Quy 1")
        in 4..6 -> println("Quy 2")
        in 7..9 -> println("Quy 3")
        in 10..12 -> println("Quy 4")
    }
}

fun solve3(n: Int){
    var S = 0
    for(i in 1..n){
        S = S + i
    }
    println("$S")
}

fun factorial(f: Int): Int {
    if (f == 0) {5
        return 1
    } else {
        return f * factorial(f - 1)
    }
}


