package adr_week_1

fun main(args: Array<String>){
//    println("Chó Hoa")
//    var x:Int? = null
//    var st:String?
//
//    println("Input number")
//    st = readLine();
//    if(st!=null){
//        x=st.toInt();
//        print("x = $x")
//    }
//
//    println("x = $x")
//
//    var numberList = arrayOf(1,2,4)

    for(i in 1..100 step 2){
        println("$i")
    }

    val day = 2
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Hay Day")
    }

    //or

    when(day){
        in 1..5 -> println("Weekday")
        else -> println("Weekend")
    }

    //or
    when(day) {
        1 -> {
            println()
        }
    }

    //do while same Java, just different for

}