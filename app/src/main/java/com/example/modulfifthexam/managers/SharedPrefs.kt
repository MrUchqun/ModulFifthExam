package com.example.modulfifthexam.managers

import android.content.Context
import androidx.core.content.edit

class SharedPrefs(context: Context) {

    private val pref = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)

    var isSaved: Boolean
        get() = pref.getBoolean("isSaved", false)
        set(value) = pref.edit { this.putBoolean("isSaved", value) }

}