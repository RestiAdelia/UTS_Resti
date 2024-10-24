package com.restiadelia.uts_resti

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    private lateinit var btnsihnin : Button
    private lateinit var btnsignup :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        btnsignup=findViewById(R.id.btnsignup)
        btnsihnin=findViewById(R.id.btnsignin)

        btnsihnin.setOnClickListener(){
            val intent = Intent(this, LoginpageActivity::class.java )
            startActivity(intent)
        }
        btnsignup.setOnClickListener(){
            val intent = Intent(this, SignupsActivity::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}