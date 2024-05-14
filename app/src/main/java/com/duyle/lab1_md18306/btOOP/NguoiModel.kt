package com.duyle.lab1_md18306.btOOP

open class NguoiModel(var hoten: String, var tuoi: Int?, var quequan: String?) {

    open fun getThongTin () : String {
        return "$hoten - Tuoi: $tuoi - Que: $quequan"
    }
}