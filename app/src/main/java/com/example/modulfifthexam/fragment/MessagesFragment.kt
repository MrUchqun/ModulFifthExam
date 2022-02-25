package com.example.modulfifthexam.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.modulfifthexam.R
import com.example.modulfifthexam.adapter.MessagesAdapter
import com.example.modulfifthexam.model.Message

class MessagesFragment() : Fragment() {
    val image: String = "https://images.unsplash.com/photo-1414235077428-338989a2e8c0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_messages_page, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

        val rvCollections: RecyclerView = view.findViewById(R.id.rv_messages)

        rvCollections.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rvCollections.adapter = context?.let { MessagesAdapter(it,getMessages()) }

    }

    private fun getMessages(): ArrayList<Message> {
        val messages = ArrayList<Message>()
        messages.add(Message(image,"Restaurant"))
        messages.add(Message(image,"Restaurant"))
        messages.add(Message(image,"Restaurant"))
        messages.add(Message(image,"Restaurant"))
        messages.add(Message(image,"Restaurant"))
        messages.add(Message(image,"Restaurant"))
        messages.add(Message(image,"Restaurant"))
        messages.add(Message(image,"Restaurant"))
        messages.add(Message(image,"Restaurant"))
        messages.add(Message(image,"Restaurant"))
        messages.add(Message(image,"Restaurant"))
        messages.add(Message(image,"Restaurant"))
        return messages
    }

}