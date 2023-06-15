package dev.mitingi.contactlist2

import android.content.Intent
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


        binding.btfloat.setOnClickListener {
            val intent=Intent(this,addcontact::class.java)
            startActivity(intent)
        }
        Contacts()

    }


    fun Contacts(){
        var contact1=ContactData("https://images.unsplash.com/photo-1533636721434-0e2d61030955?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fHByb2ZpbGUlMjBwaG90byUyMG9mJTIwYmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Joy Alan","@joyallan","0720374563")
        var contact2=ContactData("https://images.unsplash.com/photo-1463453091185-61582044d556?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTB8fHByb2ZpbGUlMjBwaG90byUyMG9mJTIwYmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Marsian Pakire","@Mp","0754634563")
        var contact3=ContactData("https://images.unsplash.com/photo-1532074205216-d0e1f4b87368?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=441&q=80","Ivy Kogo","@ivykogo","0745364563")
        var contact4=ContactData("https://media.istockphoto.com/id/1208585275/photo/profile-of-a-serene-young-woman.webp?b=1&s=170667a&w=0&k=20&c=b0YisufDREAYdpfFBhuBHFkohw58QW-CpCIUX4LsGmY=","Eunice Musenya","@musenyaE","0720374563")
        var contact5=ContactData("https://images.unsplash.com/photo-1664575603992-0f17b771dd91?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","Victor Kamau","@kamauv","0746784563")
        var contact6=ContactData("https://images.unsplash.com/photo-1557296387-5358ad7997bb?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8ZmFjZXxlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60","Dagglas Musau","@musauD","0789074563")
        var contact7=ContactData("https://images.unsplash.com/photo-1601412436009-d964bd02edbc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGZhY2V8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Purity Ambani","@ambani","075674563")
        var contact8=ContactData("https://images.unsplash.com/photo-1601412436009-d964bd02edbc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGZhY2V8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Rita Raven","@ritaraven","0746784563")
        var contact9=ContactData("https://images.unsplash.com/photo-1601412436009-d964bd02edbc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGZhY2V8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Waven Kirathe","@wavenKirathe","0789074563")
        var contact10=ContactData("https://images.unsplash.com/photo-1601412436009-d964bd02edbc?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGZhY2V8ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60","Peter Maru","@peterkirathe","0756745638")






        var contactlists= listOf<ContactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        var ContactRvAdaptor=ContactRvAdaptor(contactlists)
        binding.Rvcontact.layoutManager=LinearLayoutManager(this)
        binding.Rvcontact.adapter=ContactRvAdaptor

    }
}