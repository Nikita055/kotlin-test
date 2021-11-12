package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.CustomAdapter.*

class CustomAdapter(val userList:ArrayList<User>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    override fun getItemCount(): Int {
      return userList.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: User){
            val textViewName = itemView.findViewById<TextView>(R.id.textViewUsername) as TextView
            val textViewAddress = itemView.findViewById<TextView>(R.id.textViewAddress) as TextView
            textViewName.text = user.name
            textViewAddress.text = user.address
        }
    }
}