package fragments

import android.os.Bundle
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.rm.co2planet.R

class AboutAppFragment : Fragment() {
    lateinit var txtAboutApp:TextView
    lateinit var txtMadeBy:TextView
    lateinit var first:String
    lateinit var  next:String
    lateinit var rushi:String
    lateinit var jayram:String


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about_app, container, false)
        first = "will help you to estimate your family CO₂ emission per year, and helps you realise the number of trees you must plant in order to nullify your emission.";
        next = "<b><font color='#8B0000'>Family CO₂ Footprint(FCF) </font></b>"
        txtAboutApp  = view.findViewById(R.id.txtAboutApp)
        txtAboutApp.text = Html.fromHtml(next + first)

        rushi="This app is built by <font color='#8b0000'>Rushi Mayur</font>"
        jayram="under guidance of <font color='#8b0000'>Jayaram Udupa Sir</font>"
        txtMadeBy=view.findViewById((R.id.txtMadeBy))
        txtMadeBy.text=Html.fromHtml(rushi + jayram)

        // Inflate the layout for this fragment
        return view
    }


}
