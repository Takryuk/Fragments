package com.app1.fragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class Setting_Adapter(data: ArrayList<Setting_class>, var context:Context): RecyclerView.Adapter<Setting_Adapter.ViewHolder>(){


    var data:List<Setting_class>

    init{
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(context).inflate(R.layout.setting_item, parent, false)

        return  ViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image_view.setImageResource(data[position].image)

    }


    class ViewHolder(item: View):RecyclerView.ViewHolder(item){

        var image_view: CircleImageView


        init{
            image_view = item.findViewById(R.id.setting_item_image)
        }
    }

}