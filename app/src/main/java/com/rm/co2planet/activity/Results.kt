package com.rm.co2planet.activity

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.rm.co2planet.R

class Results : AppCompatActivity() {

    lateinit var txtF1: TextView
    lateinit var txtF2: TextView
    lateinit var txtF3: TextView
    lateinit var txtF4: TextView
    lateinit var txtF5: TextView
    lateinit var txtF6: TextView
    lateinit var txtF7: TextView
    lateinit var txtF8: TextView

    lateinit var btnFinalEstimation:Button
    lateinit var toolbar2:androidx.appcompat.widget.Toolbar
    lateinit var kpy:String
    lateinit var f1:String
    lateinit var f2:String
    lateinit var f3:String
    lateinit var f4:String
    lateinit var f5:String
    lateinit var f6:String
    lateinit var f7:String
    lateinit var f8:String







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.final_result)


        txtF1=findViewById(R.id.txtF1)
        txtF2=findViewById(R.id.txtF2)
        txtF3=findViewById(R.id.txtF3)
        txtF4=findViewById(R.id.txtF4)
        txtF5=findViewById(R.id.txtF5)
        txtF6=findViewById(R.id.txtF6)
        txtF7=findViewById(R.id.txtF7)
        txtF8=findViewById(R.id.txtF8)

        toolbar2=findViewById(R.id.toolbar2)
        btnFinalEstimation=findViewById(R.id.btnFinalEstimation)
        setUpToolbar()






        val a= intent.getStringExtra("A")
        val b= intent.getStringExtra("B")
        val c= intent.getStringExtra("C")
        val d= intent.getStringExtra("D")
        val e= intent.getStringExtra("E")
        val f= intent.getStringExtra("F")
        val g= intent.getStringExtra("G")
        val h= intent.getStringExtra("H")
        val fin= intent.getStringExtra("FIN")




        f1 = "CO₂ made by breathing in the family : <font color='#FF7464'>$a</font> kg per year."
        f2 = "CO₂ made by emission due to vehicles :<font color='#FF7464'>$b</font> kg per year."
        f3 = "CO₂ made by the use of electricity : <font color='#FF7464'>$c</font> kg per year."
        f4 = "CO₂ emission by water usage : <font color='#FF7464'>$d</font> kg per year."
        f5 = "CO₂ made by LPG gas cylinder : <font color='#FF7464'>$e</font> kg per year."
        f6 = "CO₂ made due to travel in vehicles for household things : <font color='#FF7464'>$f</font> kg per year."
        f7 = "CO₂ made due to travel to college/school : <font color='#FF7464'>$g</font> kg per year."
        f8= "CO₂ made by travel during vacation : <font color='#FF7464'>$h</font> kg per year."

        txtF1.text= Html.fromHtml(f1)
        txtF2.text= Html.fromHtml(f2)
        txtF3.text= Html.fromHtml(f3)
        txtF4.text= Html.fromHtml(f4)
        txtF5.text= Html.fromHtml(f5)
        txtF6.text= Html.fromHtml(f6)
        txtF7.text= Html.fromHtml(f7)
        txtF8.text= Html.fromHtml(f8)



        btnFinalEstimation.setOnClickListener {



           val u=fin
            val intent = Intent(this@Results, Mango::class.java)
            intent.putExtra("SUM", u)
            startActivity(intent)
        }


    }
    fun setUpToolbar() {
        setSupportActionBar(toolbar2)
        supportActionBar?.title = "Estimation"


    }






}




