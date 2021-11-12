package com.example.test

import android.app.Activity
import android.content.Context
import android.icu.text.CaseMap
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter(private val context: Activity,private val title: Array<String>,private val description:Array<String>,private val imgId:Array<Int>):ArrayAdapter<String>(context,R.layout.custom_list,title) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_list,null,true)

        val titleText = rowView.findViewById<TextView>(R.id.title) as TextView
        val imageView = rowView.findViewById<ImageView>(R.id.icon) as ImageView
        val subtitleText = rowView.findViewById<TextView>(R.id.description) as TextView

        titleText.text = title[position]
        imageView.setImageResource(imgId[position])
        subtitleText.text = description[position]

        return rowView
    }


}