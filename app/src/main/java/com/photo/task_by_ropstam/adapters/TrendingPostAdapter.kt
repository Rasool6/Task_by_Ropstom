package com.photo.task_by_ropstam.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.photo.task_by_ropstam.R


class TrendingPostAdapter(var context: Context, var list: List<String>) :
    RecyclerView.Adapter<TrendingPostAdapter.ViewHolderClass>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
         val v = LayoutInflater.from(parent.context).inflate(R.layout.trening_post_row, parent, false)
         return ViewHolderClass(v)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {

    }

    override fun getItemCount(): Int {
        return list.size
    }




    class ViewHolderClass(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var analogBtn = itemView.findViewById<ImageView>(R.id.analogBtn)


    }



}