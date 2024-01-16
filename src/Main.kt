fun main(args: Array<String>) {
    print("input a:")
    var a = readLine()?.toDoubleOrNull()

    if(a===null){
        println("Not invalid")
        return
    }
    print("input b:")
    var b = readLine()?.toDoubleOrNull()

    if(b===null) {
        println("Not invalid")
        return
    }

    // Tính nghiệm của phương trình
    solve(a,b)

}

fun solve(a:Double, b:Double){
    if (a == 0.0){
        if (b == 0.0){
            println("Phuong trinh vo so nghiem")
        } else {
            println("Phuong trinh vo nghiem")
        }
    } else {
        var x = -b/a
        println("nghiem pt: x = $x")
    }
}