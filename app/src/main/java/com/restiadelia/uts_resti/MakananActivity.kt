package com.restiadelia.uts_resti

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.uts_resti.Adapter.MakananAdapter
import com.restiadelia.uts_resti.Model.Mocklist1
import com.restiadelia.uts_resti.Model.modelmakanan

class MakananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_makanan)
        val rv_makanan : RecyclerView = findViewById(R.id.rv_makanan)

        rv_makanan.layoutManager = GridLayoutManager(this,2)
        val adapter =MakananAdapter(Mocklist1.getmodel()as ArrayList<modelmakanan>,this)
        rv_makanan.adapter = adapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}