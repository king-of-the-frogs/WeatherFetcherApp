package com.example.weatherfetcherapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherfetcher.R
import java.util.*

class WindActivity : AppCompatActivity() {

    private val windPresenter = WindPresenter()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wind)

        val tvForce = findViewById<TextView>(R.id.tvForce)
        tvForce.text = windPresenter.getForce(UUID.randomUUID().toString())
    }

}