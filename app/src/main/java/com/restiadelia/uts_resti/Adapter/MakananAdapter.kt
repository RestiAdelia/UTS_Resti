package com.restiadelia.uts_resti.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.restiadelia.uts_resti.DetailMakananActivity
import com.restiadelia.uts_resti.MakananActivity
import com.restiadelia.uts_resti.Model.modelmakanan
import com.restiadelia.uts_resti.R

class MakananAdapter(val itemList:ArrayList<modelmakanan>,
                     val getActivity:MakananActivity):
    RecyclerView.Adapter<MakananAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //deklarasi widget dari layoutitem
        var itemImage: ImageView
        var itemNama: TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar)
            itemNama = itemView.findViewById(R.id.nama) as TextView

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //manggil layout

        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.detailorder, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemNama.setText(itemList[position].nama)
        //kita intent
        holder.itemView.setOnClickListener(){
            //inten
            //context atau this --> getActivity
            val intent = Intent(getActivity,DetailMakananActivity::class.java)
            //kita put data untuk kita passed ke detail
            intent.putExtra("image",itemList[position].image)
            intent.putExtra("nama",itemList[position].nama)
            //passed ke detail
            getActivity.startActivity(intent)
        }
    }
}
