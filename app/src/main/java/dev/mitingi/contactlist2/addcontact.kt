package dev.mitingi.contactlist2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.mitingi.contactlist2.databinding.ActivityAddcontactBinding
import dev.mitingi.contactlist2.databinding.ActivityMainBinding

class addcontact : AppCompatActivity() {
    lateinit var binding: ActivityAddcontactBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityAddcontactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.etnbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
       validate()
    }


    fun validate() {
        val firstname = binding.etFirstname.text.toString()
        val lastname = binding.etLastname.text.toString()
        val email = binding.etEmail.text.toString()
        val number = binding.etnumber.text.toString()

        var error = false

        if (firstname.isBlank()) {
            binding.tilfirstname.error = "First name is required"
            error = true

        }
        if (lastname.isBlank()) {
            binding.tilLastname.error = "First name is required"
            error = true

        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email name is required"
            error = true

        }
        if (number.isBlank()) {
            binding.tilnumber.error = "First name is required"
            error = true

        }


        if (!error) {
            Toast.makeText(this, "Congradulations Joy on your sign up", Toast.LENGTH_SHORT)
                .show()
        }

    }


}

//    }
//
//    override fun onResume() {
//        super.onResume()
//        binding.tvlogin.setOnClickListener {
//            val intent= Intent(this,loginActivity::class.java)
//            startActivity(intent)
//        }
//        binding.etnbutton.setOnClickListener { validateSignup() }
//
//    }
//
//
//
//