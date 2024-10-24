package com.restiadelia.uts_resti

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignupsActivity : AppCompatActivity() {
    private lateinit var logintxt :TextView
    private lateinit var loginbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signups)
       logintxt=findViewById(R.id.logintxt)
        loginbtn=findViewById(R.id.loginbtn)

        logintxt.setOnClickListener(){
            val intent = Intent(this, LoginpageActivity::class.java)
            startActivity(intent)
        }
        loginbtn.setOnClickListener(){
            val intent = Intent(this, LoginpageActivity::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}