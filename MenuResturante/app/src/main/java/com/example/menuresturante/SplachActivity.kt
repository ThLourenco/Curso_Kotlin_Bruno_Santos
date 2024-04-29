package com.example.menuresturante

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplachActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach)

        Handler(Looper.getMainLooper()).postDelayed({

            val i = intent
            val j = Intent(this, ActivityResultado::class.java)
            j.putExtras(i)
            startActivity(j)




        }, 2000)


    }
}