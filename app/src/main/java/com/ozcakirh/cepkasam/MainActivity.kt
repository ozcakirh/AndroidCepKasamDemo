package com.ozcakirh.cepkasam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import com.ozcakirh.cepkasam.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        val dbFirebase =  FirebaseDatabase.getInstance().reference

        binding.btnkaydet.setOnClickListener(){

           // var oislemTarihi =  Date() //binding.edislemtarihi.text.toString().toDouble()

            //var oislemTarihix : binding.edislemtarihi.text.toString()

            //lateinit var oislemTarihiDate : Date

           // oislemTarihi = Date.parse(binding.edislemtarihi.text.toString())



                //pars//(java.util.Date) parse( binding.edislemtarihi.text.toString())

            var oislemTarihiStr = binding.edislemtarihi.text.toString()

            var oislemTarihi : Date = Date()

            var okategori = binding.edharcamakategori.text.toString()

            var obelgeno = binding.edbelgeno.text.toString()

            var oharcamax = binding.edharcamatutari.text.toString().toInt()

            oislemTarihi = Date().apply { "25.07.2022" }

            dbFirebase.child("ozcakirh").child(okategori.toString())
                .child(obelgeno.toString()).setValue(HarcamaBelgeNo(oharcamax, oislemTarihi))



            //oislemTarihiDate = LocalDateTime.parse("01.01.2022", "\"yyyy-MM-dd HH:mm:ss\"")

            //oislemTarihiDate = new LocalDateTime //.parse(oislemTarihi.toString())


            /*
            Ornek 1

            dbFirebase.child("ozcakirh").child(okategori.toString())
                .child(obelgeno.toString()).setValue(HarcamaBelgeNo(oharcamax))

            */
/*
            dbFirebase.child("ozcakirh").child(okategori.toString())
                .child(obelgeno.toString()).setValue(HarcamaBelgeNo(oharcamax, oislemTarihi)) //, oislemTarihiDate))
*/
            //dbFirebase.setValue( Harcama( oislemTarihi,okategori, oharcamax ));
            //
            //dbFirebase.child("ozcakirh").child(oislemTarihi.toString()).setValue( Harcama( oislemTarihi,okategori, oharcamax ));
           // dbFirebase.child("ozcakirh").child(okategori.toString()).setValue( Harcama( oislemTarihi, "404",oharcamax ));
            //**dbFirebase.child("ozcakirh").child(okategori.toString()).setValue( Harcama( oislemTarihi, oharcamax ));

        }



    }
}