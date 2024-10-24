package com.restiadelia.uts_resti

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginpageActivity : AppCompatActivity() {
    private lateinit var buttonlogin : Button
    private lateinit var txtsign:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loginpage)
        buttonlogin=findViewById(R.id.buttonlogin)
        txtsign=findViewById(R.id.txtsign)
        txtsign.setOnClickListener(){
            val intent = Intent(this, SignupsActivity::class.java)
            startActivity(intent)
        }
        buttonlogin.setOnClickListener(){
           val intent = Intent(this, MakananActivity::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}