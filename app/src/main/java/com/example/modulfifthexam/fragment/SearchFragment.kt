package com.example.modulfifthexam.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.modulfifthexam.R
import com.example.modulfifthexam.adapter.SearchAdapter
import com.example.modulfifthexam.model.AboutApp
import com.example.modulfifthexam.model.Message
import com.example.modulfifthexam.model.Restaurant

class SearchFragment() : Fragment() {
    val image: String = "https://images.unsplash.com/photo-1414235077428-338989a2e8c0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_search_page, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

        val rvSearch: RecyclerView = view.findViewById(R.id.rv_search)

        rvSearch.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rvSearch.adapter = context?.let { SearchAdapter(it,search()) }

    }

    private fun search(): ArrayList<Restaurant> {
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

}