package com.duyle.lab1_md18306

fun main () {

    val soA = 5
    var soB = 10

    with(soB) {
        soB = this.inc()
        println("So B: $soB")
    }

    val sv1 = SinhVienModel("Long", "PH11321", 8f)
    sv1.apply {
        tenSV = "Tuan"
        diemTB = 9f
    }
    println(sv1)

    val luyThuaBac3CuaA = soA.let {
        val kq = it * it * it
        kq
    }

    val title : String? = "Buoi 3 - Android Kotlin"
    val length = title?.run {
        if (isEmpty()) {
            0
        } else {
            length
        }
    }

    println("Do dai chuoi $title = $length")

    println(luyThuaBac3CuaA)

    println("Tong 2 so $soA va $soB = ${tinhTong(soA, soB)}")
    println("Tich 2 so $soA va $soB = ${phepNhan(soA, soB)}")
    println("Thuong 2 so $soA va $soB = ${phepChia(soA.toFloat(), soB.toFloat()) ()}")

    println("Luy thua cua so $soA = ${luyThua(soA)}")
}

val tinhTong = {soA: Int, soB: Int -> (soA + soB)}

val phepNhan : (Int, Int) -> Int
        = {soA: Int, soB: Int -> (soA * soB)}

val luyThua : (Int) -> Int = { it * it }

val phepChia = {soA: Float, soB: Float -> {
        if (soB == 0f) {
            "so bi chia phai khac 0!"
        } else {
            val kq = soA / soB
            kq
        }
    }
}