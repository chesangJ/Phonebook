package dev.mitingi.contactlist2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import dev.mitingi.contactlist2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        Contacts()
    }


    fun Contacts(){
        var contact1=ContactData("","Joy Alan","@joyallan","0720374563")
        var contact2=ContactData("","Marsian Pakire","@Mp","0754634563")
        var contact3=ContactData("","Ivy Kogo","@ivykogo","0745364563")
        var contact4=ContactData("","Eunice Musenya","@musenyaE","0720374563")
        var contact5=ContactData("","Victor Kamau","@kamauv","0746784563")
        var contact6=ContactData("","Dagglas Musau","@musauD","0789074563")
        var contact7=ContactData("","Purity Ambani","@ambani","075674563")
        var contact8=ContactData("","Rita Raven","@ritaraven","0746784563")
        var contact9=ContactData("","Waven Kirathe","@wavenKirathe","0789074563")
        var contact10=ContactData("","Peter Maru","@peterkirathe","0756745638")






        var contactlists= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        binding.Rvcontact.layoutManager=LinearLayoutManager(this)
        var ContactRvAdaptor=ContactRvAdaptor(contactlists)
        binding.Rvcontact.adapter=ContactRvAdaptor

    }
}