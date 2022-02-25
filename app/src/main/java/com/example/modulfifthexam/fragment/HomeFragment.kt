package com.example.modulfifthexam.fragment

import android.content.Context
import android.os.Bundle
import android.os.RecoverySystem
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.modulfifthexam.R
import com.example.modulfifthexam.adapter.CategoriesAdapter
import com.example.modulfifthexam.adapter.RestaurantAdapter
import com.example.modulfifthexam.model.AboutApp
import com.example.modulfifthexam.model.Collection
import com.example.modulfifthexam.model.Restaurant

class HomeFragment() : Fragment() {

    val image: String = "https://images.unsplash.com/photo-1414235077428-338989a2e8c0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home_page, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

        val rvCategories: RecyclerView = view.findViewById(R.id.rv_categories)
        val rvRestaurants: RecyclerView = view.findViewById(R.id.rv_restaurant)

        rvCategories.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = context?.let { CategoriesAdapter(it,getCategories()) }

        rvRestaurants.layoutManager = GridLayoutManager(context, 2)
        rvRestaurants.adapter = context?.let { RestaurantAdapter(it,getRestaurants()) }
    }

    private fun getRestaurants(): ArrayList<Restaurant> {
        val restaurants = ArrayList<Restaurant>()
        restaurants.add(Restaurant(image,"Doppio Zero","440 Fulton St"))
        restaurants.add(Restaurant(image,"Doppio Zero","440 Fulton St"))
        restaurants.add(Restaurant(image,"Doppio Zero","440 Fulton St"))
        restaurants.add(Restaurant(image,"Doppio Zero","440 Fulton St"))
        restaurants.add(Restaurant(image,"Doppio Zero","440 Fulton St"))
        restaurants.add(Restaurant(image,"Doppio Zero","440 Fulton St"))
        restaurants.add(Restaurant(image,"Doppio Zero","440 Fulton St"))
        restaurants.add(Restaurant(image,"Doppio Zero","440 Fulton St"))
        return restaurants
    }

    private fun getCategories():ArrayList<Collection>{
        val categories = ArrayList<Collection>()
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        categories.add(Collection(image,"Restaurant"))
        return categories
    }
}