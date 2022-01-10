package com.example.pawnationapp

import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.StringRequestListener
import com.google.android.material.floatingactionbutton.FloatingActionButton

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.dogbreedspage.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*
import org.json.JSONObject
import retrofit2.Retrofit
import android.content.Intent as Intent1

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        goToAddProduct.setOnClickListener {
            startActivity(Intent1(this, AddProductActivity::class.java))
        }

        gotodogbreedpage.setOnClickListener {
            startActivity(Intent1(this, DogBreedsPage::class.java))

        }
    }

    fun openbrowser6(view: View) {
        val openURL = android.content.Intent(ACTION_VIEW)
        openURL.data = Uri.parse("https://www.google.com/maps?sxsrf=AOaemvLx-2AJQ3fs_RD1k0VjP5wouZSY0A:1641644799461&q=vet+near+me&biw=1280&bih=577&dpr=1.5&um=1&ie=UTF-8&sa=X&ved=2ahUKEwjUr9G6k6L1AhVwSWwGHRJjCP0Q_AUoAXoECAMQAw")
        startActivity(openURL)
    }


}




