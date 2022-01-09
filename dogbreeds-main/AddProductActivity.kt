package com.example.pawnationapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AddProductActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_product)
    }

    fun openbrowser(view: View) {
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://www.amazon.in/dp/B01DOP5S9K/ref=cm_sw_r_apan_glt_fabc_dl_NZ58FPYSANJMHYXQY5F4?_encoding=UTF8&psc=1/")
        startActivity(openURL)
    }

    fun openbrowser1(view: View) {
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://www.amazon.in/Dog-Grooming/b?ie=UTF8&node=4771396031")
        startActivity(openURL)
    }
    fun openbrowser2(view: View) {
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://www.amazon.in/b?ie=UTF8&node=12327263031")
        startActivity(openURL)
    }
    fun openbrowser3(view: View) {
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://www.amazon.in/Dog-Toys/b?ie=UTF8&node=4771401031")
        startActivity(openURL)
    }
    fun openbrowser4(view: View) {
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://www.amazon.in/Dog-Toys/b?ie=UTF8&node=4771401031")
        startActivity(openURL)
    }
    fun openbrowser5(view: View) {
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://www.amazon.in/Dogs-Sweaters/b?ie=UTF8&node=4771566031")
        startActivity(openURL)
    }
    fun openbrowser6(view: View) {
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://www.google.com/maps/search/vets+near+me/@17.3272987,78.5284628,13z/data=!3m1!4b1")
        startActivity(openURL)
    }


}