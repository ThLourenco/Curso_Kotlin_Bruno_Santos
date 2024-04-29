package com.example.nomesobrenome

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.nomesobrenome.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConversor.setOnClickListener(View.OnClickListener {

            val firstName = binding.edtPrimeiroNome.text.toString().trim()
            val endName = binding.edtSobreNome.text.toString().trim()

            if(firstName.isEmpty() || endName.isEmpty()){

                binding.txtNomeCompleto.setText("Prencha o nome corretamente")
                Toast.makeText(applicationContext, "Prencha o nome corretamente", Toast.LENGTH_SHORT).show()
            }else{
                binding.txtNomeCompleto.text = ("Olá ${firstName } ${endName}")
                Toast.makeText(applicationContext, "Olá ${firstName } ${endName}", Toast.LENGTH_SHORT).show()
            }

        })

    }
}