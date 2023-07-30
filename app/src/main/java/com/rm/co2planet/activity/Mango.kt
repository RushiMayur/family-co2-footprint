package com.rm.co2planet.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.rm.co2planet.R


class Mango : AppCompatActivity() {
    lateinit var txtCO2: TextView
    lateinit var txtMangoTrees:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mango_final)

        txtCO2=findViewById(R.id.txtCO2)
        txtMangoTrees=findViewById(R.id.txtMangoTrees)


        val fin= intent.getStringExtra("SUM")


        val mangoTrees=fin.toString().toDouble()

        val fi=mangoTrees.toFloat()

        val man=(mangoTrees/21).toInt()
        val mango=man.toString()

        txtCO2.text= "$fi Kg / Year"
        txtMangoTrees.text= "${mango} Trees per year(approx.)"


    }
}