package com.ozcakirh.cepkasam


//import android.os.Parcel
//import android.os.Parcelable
//import android.widget.DatePicker
//import java.time.format.DateTimeFormatter
import android.os.Parcel
import android.os.Parcelable
import java.util.*

open class  HarcamaBaslik{
    var BelgeNo: String = "";

    constructor(oBelgeNo: String)
    {
        BelgeNo = oBelgeNo;
    }

}

class Harcama : HarcamaBaslik  {
    
    var tarih: Date = Date() //"30.07.2022"
    //var kategori: String = ""
    var tutar: Int = 0


    constructor(otarih: Date , oBelgeNo: String, otutar: Int) : super(oBelgeNo) {
        this.tarih = otarih

        //this.KateGori = okategori;
       // this.kategori = okategori

        this.tutar = otutar

    }



/*
    constructor(otarih: Date ,  otutar: Int)
    {
        this.tarih = otarih

        //this.kategori = okategori

        this.tutar = otutar

    }

*/



}