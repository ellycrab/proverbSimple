package com.ellycrab.newmini01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class LVAdapter(private val List:MutableList<String>): BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView

        if(convertView == null){
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.lv_item,parent,false)
        }

        val listViewText = convertView?.findViewById<TextView>(R.id.textArea)
        listViewText!!.text = List[position]

        return convertView!!
    }
}