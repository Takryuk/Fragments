package com.app1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

/**
 * A simple [Fragment] subclass.
 */
class setting_fragments : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val layout = inflater.inflate(R.layout.fragment_setting_fragments, container, false)

        val items = ArrayList<Setting_class>()

        items.add(Setting_class(R.drawable.slide_1))
        items.add(Setting_class(R.drawable.slide_2))
        items.add(Setting_class(R.drawable.slide_3))
        items.add(Setting_class(R.drawable.slide_4))
        items.add(Setting_class(R.drawable.slide_1))
        items.add(Setting_class(R.drawable.slide_2))


        val recycler = layout.findViewById<RecyclerView>(R.id.setting_list)

        val adapter = Setting_Adapter(items, activity!!.applicationContext)

        recycler.layoutManager = GridLayoutManager(activity!!.applicationContext, 2)
        recycler.adapter = adapter

        return layout
    }

}
