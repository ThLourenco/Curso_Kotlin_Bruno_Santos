package com.example.conversor

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.conversor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDolar.setOnClickListener(View.OnClickListener { converter(4.85)  })
        binding.btnEuro.setOnClickListener(View.OnClickListener { converter(6.29)  })
        binding.btnReal.setOnClickListener(View.OnClickListener { converter(3.20)  })

    }

    private fun converter(taxa: Double) {

        val valor = binding.edtValor.text.toString().trim()

        if(!valor.isEmpty()){

            val resultado = valor.toDouble() * taxa
            binding.txtResultado.setText("${resultado}")

        }

    }
}