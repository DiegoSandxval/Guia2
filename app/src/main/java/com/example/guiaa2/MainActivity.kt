package com.example.guiaa2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onSaveButtonClick(view: View) {
        val name = findViewById<EditText>(R.id.nameEt)
        val hours = findViewById<EditText>(R.id.hoursEt)

        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("Name", name.text.toString())
        intent.putExtra("hours", hours.text.toString().toInt())

        startActivity(intent)


    }

}
