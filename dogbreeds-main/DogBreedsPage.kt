package com.example.pawnationapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import kotlinx.android.synthetic.main.dogbreedspage.*

class DogBreedsPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dogbreedspage)



    }

    fun openbrowser7(view: View) {
        val openURL = android.content.Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://dogbreed.ccbp.tech/")
        startActivity(openURL)
    }
}