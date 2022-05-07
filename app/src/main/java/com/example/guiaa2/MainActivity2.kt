package com.example.guiaa2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = getIntent()
        val name = intent.getStringExtra("Name")
        val hours = intent.getIntExtra("hours", 0)
        val sfinal = hours*8.50-((hours*8.50*0.02)+(hours*8.50*0.03)+(hours*8.50*0.04))
        val iss= hours*8.50*0.02
        val afp= hours*8.50*0.03
        val rent=  hours*8.50*0.04

        findViewById<TextView>(R.id.final_S).text = "Nombre: " + name + "\n\nHoras trabajadas en el mes: " + hours + "\n\nSalario neto: " + sfinal +"\n\nDescuento del ISS: "+iss+"\n\nDescuento de AFP: "+afp+"\n\nDescuento renta: "+ rent
    }
}
