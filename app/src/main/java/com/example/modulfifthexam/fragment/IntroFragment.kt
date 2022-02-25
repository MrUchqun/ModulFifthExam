package com.example.modulfifthexam.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.modulfifthexam.R
import com.example.modulfifthexam.model.AboutApp

class IntroFragment(var aboutApp: AboutApp) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_intro_page, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

        val tvTitle: TextView = view.findViewById(R.id.tv_title)
        val tvDescription: TextView = view.findViewById(R.id.tv_description)

        tvTitle.text = aboutApp.title
        tvDescription.text = aboutApp.description
    }
}