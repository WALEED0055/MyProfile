package com.example.myprofile

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileImage = findViewById<ImageView>(R.id.profile_image)
        val fullName = findViewById<TextView>(R.id.full_name)
        val cgpa = findViewById<TextView>(R.id.cgpa)

        profileImage.setImageResource(R.drawable.ic_launcher_background)
        fullName.text = "Muhammad Waleed Sardar Rana"
        cgpa.text = "2.82"
    }
}



