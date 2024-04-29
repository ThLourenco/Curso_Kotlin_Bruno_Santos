package com.example.menuresturante

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.menuresturante.databinding.ActivityFinalBinding

class activityFinal : AppCompatActivity() {

    private lateinit var binding: ActivityFinalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val quant_cafe = i.getStringExtra("quant_cafe").toString().toInt()
        val quant_caputino = i.getStringExtra("quant_caputino").toString().toInt()
        val quant_croaca = i.getStringExtra("quant_croaca").toString().toInt()
        val preco_cafe = i.getDoubleExtra("preco_cafe", 0.0).toDouble()
        val preco_caputino = i.getDoubleExtra("preco_caputino", 0.0).toDouble()
        val preco_croaca = i.getDoubleExtra("preco_croaca", 0.0).toDouble()

        val text = "resumo do pedido:\n"
            "café: $quant_cafe preço: ${quant_cafe * preco_cafe}\n"
            "caputino: $quant_caputino preço: ${quant_caputino * preco_caputino}\n"
            "croaçã: $quant_croaca preço: ${quant_croaca * preco_croaca}"

        binding.txtPedidoFinal.setText(text)

    }
}