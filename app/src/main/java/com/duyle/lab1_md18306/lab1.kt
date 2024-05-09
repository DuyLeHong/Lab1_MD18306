package com.duyle.lab1_md18306

fun main () {
    println("Hello Kotlin - bai 1")

    println("--------------------")

    // khai bao va su dung bien
    var a : Int
    a = 2
    val b = 2
    var c = a + b

    val mess : String = "Tổng 2 số $a và $b là: $c"

    println(mess)

    val soA = 1
    val soB = 0f
    val kq = phepChia(soA, soB)
    println(kq)

    // khai báo và su dung mảng
    val arrX = intArrayOf(1,2,3,4)
    var arrY = arrayOf(1.5f, "A", 1)

    for (x in arrX) {
        println(x)
    }

    println("""Giá trị đầu tiên mảng X: ${arrX[0]}
        | Giá trị đầu tiên mảng Y: ${arrY[0]}
    """.trimMargin())
}

fun phepChia (soA : Int, soB : Float) : String {
    if (soB == 0f) {
        return "Số B không được = 0!"
    }

    val thuong = soA / soB

    return "Thương 2 số $soA và $soB = $thuong"
}



class lab1 {
}