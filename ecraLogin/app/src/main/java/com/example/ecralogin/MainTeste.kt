package com.example.ecralogin

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ecralogin.databinding.ActivityMainTesteBinding

class MainTeste : AppCompatActivity() {

    private lateinit var binding: ActivityMainTesteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainTesteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val nome = i.extras?.getString("nome")
        val sobreNome = i.extras?.getString("sobreNome")


        if(nome == ("") || nome == null) {
            Toast.makeText(applicationContext,"Nome nao inserido", Toast.LENGTH_SHORT).show()
        }else{ binding.txtPrimeiroNome.setText("$nome")}

        if(sobreNome == ("") || sobreNome == null) {
            Toast.makeText(applicationContext,"SobreNome nao inserido", Toast.LENGTH_SHORT).show()
        }else{ binding.txtSobreNome.setText("$sobreNome")}


        binding.btnVoltar.setOnClickListener(View.OnClickListener {

          val inome =  intent.putExtra("nome", binding.txtPrimeiroNome.text.toString())
            val isobreNome = intent.putExtra("sobreNome", binding.txtSobreNome.text.toString())
            setResult(1,inome)
            setResult(2, isobreNome)
            finish()

        })
    }
}