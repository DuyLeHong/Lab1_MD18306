package com.duyle.lab1_md18306.btOOP

fun main () {
    var gv1 = CBGV("Nguyen Van Long", 30, "HCM", "003468", 500f, 50f, 10f)

    println(gv1.getThongTin())

    println("------------------------")
    println("Menu quan ly GV")
    println("1. Them giao vien")
    println("2. Hien thi danh sach GV")
    println("3. Xoa GV")
    println("4. Cap nhat thong tin GV")
    println("5. Thoat chuong trinh")

    var tiepTuc: Boolean
    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()
            when (options) {
                1 -> {

                }


                2 -> {
                    println("Danh sach giao vien")
                    println("--------------------------")
                }

                3 -> {
                    println("Xoa giao vien")
                    println("--------------------------")
                    println("Nhap msgv can xoa: ")

                }

                4 -> {
                    println("Cap nhat thong tin gv")
                    println("Nhap msgv can cap nhat: ")
                }

                5 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }
            println("Ban co muon chon tiep lua chon tren menu? (c/k) ")
            val s = readLine()
            tiepTuc = s == "c"
        } catch (e: Exception) {
            println("Nhap sai, vui long nhap lai")
            tiepTuc = true
        }

    } while (tiepTuc)
}