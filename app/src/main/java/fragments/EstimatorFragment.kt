package fragments


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.rm.co2planet.R
import com.rm.co2planet.activity.Results
import org.json.JSONObject


class EstimatorFragment : Fragment() {

    lateinit var etPerson:EditText
    lateinit var etPetrol:EditText
    lateinit var etElectricity:EditText
    lateinit var etWater:EditText
    lateinit var etLpg:EditText
    lateinit var etHouseTravel:EditText
    lateinit var etSchool:EditText
    lateinit var etVacation:EditText
    lateinit var btnGetResults:Button
    lateinit var preferences:SharedPreferences







     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
     ): View? {

         val view = inflater.inflate(R.layout.fragment_estimator, container, false)

         etPerson = view.findViewById(R.id.etPerson)
         etPetrol = view.findViewById(R.id.etPetrol)
         etElectricity = view.findViewById(R.id.etElectricity)
         etWater = view.findViewById(R.id.etWater)
         etLpg = view.findViewById(R.id.etLpg)
         etHouseTravel = view.findViewById(R.id.etHouseTravel)
         etSchool = view.findViewById(R.id.etSchool)
         etVacation = view.findViewById(R.id.etVacation)
         btnGetResults = view.findViewById(R.id.btnGetResults)



        btnGetResults.setOnClickListener {



            val registerUser = JSONObject()
            registerUser.put("name", etPerson.text)


            try {

                var person = etPerson.text.toString().toDouble()

                val mul1 = (person * 364).toFloat()
                val a = mul1.toString()


                var petrol = etPetrol.text.toString().toDouble()
                val mul2 = (petrol * (0.022772278*12)).toFloat()
                val b = mul2.toString()

                var electricity = etElectricity.text.toString().toDouble()
                val mul3 = (electricity * 12*(0.92/7)).toFloat()
                val c = mul3.toString()

                var water = etWater.text.toString().toDouble()
                val mul4 = (water * 179.4/325).toFloat()
                val d = mul4.toString()

                var lpg = etLpg.text.toString().toDouble()
                val mul5 = (lpg * 280.705152/0.6).toFloat()
                val e = mul5.toString()

                var travel = etHouseTravel.text.toString().toDouble()
                val mul6 = (travel * 83.72/1.5).toFloat()
                val f = mul6.toString()

                var school = etSchool.text.toString().toDouble()
                val mul7 = (school * 502.32/9).toFloat()
                val g = mul7.toString()

                var vacation = etVacation.text.toString().toDouble()
                val mul8 = (vacation * 383.333333/2000).toFloat()
                val h = mul8.toString()

                val fin = mul1 + mul2 + mul3 + mul4 + mul5 + mul6 + mul7 + mul8
                val final = fin.toString()

                val intent = Intent(activity, Results::class.java)
                intent.putExtra("A", a)
                intent.putExtra("B", b)
                intent.putExtra("C", c)
                intent.putExtra("D", d)
                intent.putExtra("E", e)
                intent.putExtra("F", f)
                intent.putExtra("G", g)
                intent.putExtra("H", h)
                intent.putExtra("FIN", final)




                startActivity(intent)


            } catch(e:NumberFormatException ) {
                val alterDialog = AlertDialog.Builder(activity as Context)
                alterDialog.setTitle("Enter All The Values!")
                alterDialog.setMessage("Enter 0 if any block is blank!")
                alterDialog.setPositiveButton("Ok") { _, _ ->


                }

                alterDialog.create()
                alterDialog.show()




        }




            }



         return view
    }








        }





