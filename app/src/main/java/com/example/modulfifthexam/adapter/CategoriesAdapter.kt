package com.example.modulfifthexam.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.modulfifthexam.R
import com.example.modulfifthexam.model.Collection

class CategoriesAdapter(var context: Context, var items: ArrayList<Collection>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_categories, parent, false)
        return CategoriesViewHolder(view)
    }

    class CategoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivAbout: ImageView = view.findViewById(R.id.iv_about)
        val tvTitle: TextView = view.findViewById(R.id.tv_title)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val categories = items[position]
        if (holder is CategoriesViewHolder) {
            holder.tvTitle.text = categories.title
            Glide.with(context).load(categories.image).centerCrop()
                .into(holder.ivAbout)

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}