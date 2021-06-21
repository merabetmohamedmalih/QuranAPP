package com.example.projettdmubunto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import android.content.Context
import com.example.projettdmubunto.Ayah


class AyahAdapter(val context:Context, var data:List<Ayah>, val onClick :()->Unit):
    RecyclerView.Adapter<MyViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
      return  MyViewHolder(LayoutInflater.from(context).inflate(R.layout.ayah, parent, false))

    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.Ayahar.text=data[position].TextAR
        holder.Ayahen.text=data[position].englishWord
        holder.Ayahar.setOnClickListener {
            onClick()
        }
        holder.Ayahen.setOnClickListener {
            onClick
        }

    }

    override fun getItemCount()=data.size
    }


class MyViewHolder(view:View):RecyclerView.ViewHolder(view){

    val Ayahar=view.findViewById<TextView>(R.id.ayahAr) as TextView
    val Ayahen=view.findViewById<TextView>(R.id.ayahen) as TextView

}


