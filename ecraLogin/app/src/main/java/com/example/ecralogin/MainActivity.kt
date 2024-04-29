package com.example.ecralogin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.ecralogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;
    private lateinit var result: ActivityResultLauncher<Intent>
    private var nome = ""
    private var sobreNome = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinuar.setOnClickListener(View.OnClickListener {

            var login = binding.edtLogin.text.toString().trim()
            var senha = binding.edtPassworld.text.toString().trim()

            var keynome = binding.edtPriemiroNome.text.toString().trim()
            var keysobreNome = binding.edtSobreNome.text.toString().trim()

            if(login == ("123") && senha == ("123")){

                val i = Intent(this, MainTeste::class.java)
                i.putExtra("nome", keynome)
                i.putExtra("sobreNome", keysobreNome)

                result.launch(i)

            }else{

                Toast.makeText(applicationContext,"Login ou senha estão incorretos", Toast.LENGTH_SHORT).show()

            }

            binding.edtLogin.setText("")
            binding.edtPassworld.setText("")

        })

        result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){

            if(it.data != null && it.resultCode == 1 && it.resultCode == 2){

                nome = it.data?.getStringExtra("nome").toString()
                sobreNome = it.data?.getStringExtra("sobreNome").toString()
                binding.edtPriemiroNome.setText("$nome")
                binding.edtPriemiroNome.setText("$sobreNome")


            }

        }

    }
}