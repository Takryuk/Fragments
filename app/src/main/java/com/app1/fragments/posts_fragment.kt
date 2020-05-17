package com.app1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * A simple [Fragment] subclass.
 */
class posts_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val layout = inflater.inflate(R.layout.fragment_posts_fragment, container, false)

        val items = ArrayList<Custom_class>()

        items.add(Custom_class("Android", R.drawable.slide_1))
        items.add(Custom_class("Android", R.drawable.slide_2))
        items.add(Custom_class("Android", R.drawable.slide_3))
        items.add(Custom_class("Android", R.drawable.slide_4))
        items.add(Custom_class("Android", R.drawable.slide_3))
        items.add(Custom_class("Android", R.drawable.slide_4))
        items.add(Custom_class("Android", R.drawable.slide_1))
        items.add(Custom_class("Android", R.drawable.slide_2))
        items.add(Custom_class("Android", R.drawable.slide_3))
        items.add(Custom_class("Android", R.drawable.slide_4))
        items.add(Custom_class("Android", R.drawable.slide_3))
        items.add(Custom_class("Android", R.drawable.slide_4))


        val recycler = layout.findViewById<RecyclerView>(R.id.posts_list)
        val adapter = ItemAdapter(items, activity!!.applicationContext)

        recycler.layoutManager = GridLayoutManager(activity!!.applicationContext, 2)

        recycler.adapter = adapter

        return layout
    }

}
