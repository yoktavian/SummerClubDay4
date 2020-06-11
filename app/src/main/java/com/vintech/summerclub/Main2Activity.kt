package com.vintech.summerclub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title = "Home"

        val nameFromIntent = intent.getStringExtra("name")
        personName.text = nameFromIntent

        val movies: ArrayList<String> = arrayListOf("Spiderman", "Wonder women")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, movies)
        listMovies.adapter = adapter
    }
}
