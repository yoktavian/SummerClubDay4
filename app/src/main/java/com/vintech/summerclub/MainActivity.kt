package com.vintech.summerclub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_v2.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_v2)
        title = "Registration"

        submitButton.setOnClickListener {
            val result = inputPersonName.text.toString()
            helloTextLabel.text = result
            goToMainActivity2(result)
        }
    }

    fun goToMainActivity2(name: String) {
        val intent = Intent(this, Main2Activity::class.java)
        intent.putExtra("name", name)
        startActivity(intent)
    }
}