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
import com.example.modulfifthexam.model.Restaurant

class RestaurantAdapter(var context: Context, var items: ArrayList<Restaurant>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant, parent, false)
        return RestaurantViewHolder(view)
    }

    class RestaurantViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivAbout: ImageView = view.findViewById(R.id.iv_about)
        val tvTitle: TextView = view.findViewById(R.id.tv_title)
        val tvDescription: TextView = view.findViewById(R.id.tv_description)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val restaurant = items[position]
        if (holder is RestaurantViewHolder) {
            holder.tvTitle.text = restaurant.title
            holder.tvDescription.text = restaurant.description
            Glide.with(context).load(restaurant.image).centerCrop()
                .into(holder.ivAbout)

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}