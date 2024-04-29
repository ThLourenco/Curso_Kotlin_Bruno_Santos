package com.example.menuresturante

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.menuresturante.databinding.ActivityResultadoBinding

class ActivityResultado : AppCompatActivity() {

    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent

        val quant_cafe = i.getStringExtra("qt_cafe").toString().toInt()
        val quant_caputino = i.getStringExtra("qt_capu").toString().toInt()
        val quant_croaca = i.getStringExtra("qt_croaca").toString().toInt()
        val preco_cafe = i.getDoubleExtra("preco_cafe", 0.0)
        val preco_capu = i.getDoubleExtra("preco_capu", 0.0)
        val preco_croaca = i.getDoubleExtra("preco_croaca", 0.0)

        val texto = "Resumo do pedido \n" +
            "café: ${quant_cafe} preço:${preco_cafe * quant_cafe} \n" +
            "café: ${quant_caputino} preço:${preco_capu * quant_caputino} \n" +
            "café: ${quant_croaca} preço:${preco_croaca * quant_croaca}";

        binding.txtPedidoFinal.setText(texto)
    }
}