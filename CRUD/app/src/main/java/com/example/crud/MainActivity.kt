package com.example.crud

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.crud.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var pos = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listUtilizador = ArrayList<Utilizador>()
        listUtilizador.add(Utilizador("user","123"))
        listUtilizador.add(Utilizador("user2","456"))
        listUtilizador.add(Utilizador("boss","123"))

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listUtilizador)
        binding.lstListCadastro.adapter = adapter

        binding.lstListCadastro.setOnItemClickListener { _, _, position, _ ->

            binding.edtUserName.setText(listUtilizador.get(position).userName)
            binding.edtPassWord.setText(listUtilizador.get(position).passWord)
            pos = position

        }

        binding.btnInserir.setOnClickListener(View.OnClickListener {

            val userName = binding.edtUserName.text.toString().trim()
            val passWord = binding.edtPassWord.text.toString().trim()

            if( !userName.isEmpty() && !passWord.isEmpty()){
                listUtilizador.add(Utilizador(userName, passWord))
                adapter.notifyDataSetChanged()
                binding.edtUserName.setText("")
                binding.edtPassWord.setText("")
                pos = -1
            }
        })

        binding.btnEditar.setOnClickListener(View.OnClickListener {

            if(pos >= 0){

                val userName = binding.edtUserName.text.toString().trim()
                val passWord = binding.edtPassWord.text.toString().trim()

                if( !userName.isEmpty() && !passWord.isEmpty()){
                listUtilizador.get(pos).userName = userName
                listUtilizador.get(pos).passWord = passWord
                adapter.notifyDataSetChanged()
                binding.edtUserName.setText("")
                binding.edtPassWord.setText("")
                pos = -1
                }
            }

        })
        binding.btnDelete.setOnClickListener(View.OnClickListener {

            if(pos >= 0){
            listUtilizador.removeAt(pos)
            adapter.notifyDataSetChanged()
            binding.edtUserName.setText("")
            binding.edtPassWord.setText("")
            pos = -1
            }
        })

        binding.btnLimpar.setOnClickListener(View.OnClickListener {
            listUtilizador.clear()
            adapter.notifyDataSetChanged()
            binding.edtUserName.setText("")
            binding.edtPassWord.setText("")
            pos = -1
        })

    }
}