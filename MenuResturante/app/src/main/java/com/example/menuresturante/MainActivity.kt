package com.example.menuresturante

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.menuresturante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val priceCafe = 5.0
    private val priceCaputino = 8.0
    private val priceCoraca = 4.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFinalizar.setOnClickListener(View.OnClickListener {

            val i = Intent(this, SplachActivity::class.java)
            i.putExtra("qt_cafe", binding.edtQuantidadeCade.text.toString())
            i.putExtra("qt_capu", binding.edtQuantidadeCaputino.text.toString())
            i.putExtra("qt_croaca", binding.edtQuantidadeCoraca.text.toString())
            i.putExtra("preco_cafe", priceCafe)
            i.putExtra("preco_capu", priceCaputino)
            i.putExtra("preco_croaca", priceCoraca)
            startActivity(i)

        })
        binding.ckCafe.setOnClickListener(View.OnClickListener {
            if (binding.ckCafe.isChecked){
                binding.edtQuantidadeCade.setText("1").toString()
                binding.txtPriceCafe.visibility = View.VISIBLE
            }else{
                binding.edtQuantidadeCade.setText("0")
                binding.txtPriceCafe.visibility = View.GONE
            }


        })
        binding.ckCaputino.setOnClickListener(View.OnClickListener {
            if (binding.ckCaputino.isChecked){
                binding.edtQuantidadeCaputino.setText("1")
                binding.txtPriceCaputino.visibility = View.VISIBLE
            }else{
                binding.edtQuantidadeCaputino.setText("0")
                binding.txtPriceCaputino.visibility = View.GONE
            }


        })
        binding.ckCroaca.setOnClickListener(View.OnClickListener {

            if (binding.ckCroaca.isChecked){
                binding.edtQuantidadeCoraca.setText("1")
                binding.txtPriceCroaca.visibility = View.VISIBLE
            }else{
                binding.edtQuantidadeCoraca.setText("0")
                binding.txtPriceCroaca.visibility = View.GONE
            }

        })



    }
}