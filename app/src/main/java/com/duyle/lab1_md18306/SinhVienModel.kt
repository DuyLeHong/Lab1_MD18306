package com.duyle.lab1_md18306

class SinhVienModel (var tenSV: String, var mssv: String, var diemTB: Float) {
    var daTotNghiep : Boolean? = null
    var tuoi : Int? = null

    constructor(tenSV: String,  mssv: String, diemTB: Float, datotnghiep: Boolean, tuoi: Int) : this(tenSV, mssv, diemTB) {
        this.daTotNghiep = datotnghiep
        this.tuoi = tuoi
    }

    fun getThongTin () : String {
        var thongtin : String
        if (daTotNghiep != null && tuoi != null) {
            thongtin = "Ten: $tenSV , mssv: $mssv , diemTB: $diemTB , da tot nghiep: $daTotNghiep , tuoi: $tuoi"
        } else {
            thongtin = "Ten: $tenSV , mssv: $mssv , diemTB: $diemTB"
        }
        return thongtin
    }
}