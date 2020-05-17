package com.app1.fragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(data:ArrayList<Custom_class>, var context: Context): RecyclerView.Adapter<ItemAdapter.ViewHolder>(){

    var data:List<Custom_class>
    init {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(context).inflate(R.layout.item_custom, parent, false)

        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.title.text = data[position].title
        holder.image.setImageResource(data[position].image)

    }

    override fun getItemCount(): Int {
        return data.size
    }


    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){


        var title: TextView
        var image: ImageView

        init {
            title = itemView.findViewById(R.id.item_title)
            image = itemView.findViewById(R.id.item_image)
        }
    }
}