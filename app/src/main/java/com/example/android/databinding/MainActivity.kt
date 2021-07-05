package com.example.android.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnDisplay.setOnClickListener(){

            var p = Person("Ali", "abc123@gmail.com", "123456", "20 Jalan ABC")

            binding.personDetail = p

            /*binding.tvName.text = "Ali"
            binding.tvAddress.text = "20 Jalan ABC"
            binding.tvEmail.text = "abc123@gmail.com"
            binding.tvIC.text = "123456"*/
        }

        binding.btnSecond.setOnClickListener(){

            var p = Person("Abu", "def123@gmail.com", "7890123", "21 Jalan DEF")

            binding.personDetail = p


        }
    }
}