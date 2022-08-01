package com.ozcakirh.cepkasam

import java.util.*

class HarcamaBelgeNo {

    var tutar : Int = 0

    var tarih : Date = Date()

    constructor(otutar : Int )
    {
        this.tutar = otutar;
    }

    constructor(otutar : Int , otarih : Date)
    {
        this.tutar = otutar

        this.tarih = otarih
    }
}

