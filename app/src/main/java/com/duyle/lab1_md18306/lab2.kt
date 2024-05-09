package com.duyle.lab1_md18306

fun main() {
    // làm việc với null safety

//    val tenSV : String? = "Nguyen Van Long"
//
//    if (tenSV != null) {
//        val mssv = getThongTinSV(tenSV!!)
//        println("MSSV của $tenSV : $mssv")
//    }

    val sv1 : SinhVienModel = SinhVienModel("Nguyen Van Long", "PH11324", 9.5f)

    val sv2 : SinhVienModel = SinhVienModel("Le Tuan Anh", "PH14572", 8.5f)

    sv2.daTotNghiep = false
    sv2.tuoi = 21

    val sv3 = SinhVienModel("Tran Thu Thao", "PH16445", 8.5f, false, 20)

    // tao va xu ly danh sach sv
    val listSV = mutableListOf<SinhVienModel>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)

    // xoa phan tu cuoi trong danh sach
    listSV.removeAt(listSV.size - 1)

    // cach 1: duyet nhanh
    println("Duyet nhanh")
    println("------------------")
    for (sv in listSV) {
        println(sv.getThongTin())
    }
    println("------------------")

    // cach 2: duyet co quan tam index phan tu trong list
    println("Duyet co index")
    println("------------------")
    for (i in listSV.indices) {
        println("Thong tin $i : ${listSV.get(i).getThongTin()}")
    }
}

fun getThongTinSV (tenSV: String) : String? {
    when (tenSV) {
        "Nguyen Van Long" -> {
            return "PH11331"
        }
        "Le Tuan Anh" -> return "PH11432"
        else -> return null
    }
    return null
}

