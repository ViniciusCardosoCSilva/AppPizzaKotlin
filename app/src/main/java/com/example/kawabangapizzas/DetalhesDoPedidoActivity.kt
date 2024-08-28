package com.example.kawabangapizzas

import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kawabangapizzas.databinding.ActivityDetalhesDoPedidoBinding
import com.example.kawabangapizzas.model.Pedido

class DetalheDoPedidoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalhesDoPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesDoPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Recebendo o pedido enviado pela tela anterior
        val pedido = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
        {
            intent.getParcelableExtra("pedido", Pedido::class.java)
        } else {
            intent.getParcelableExtra("pedido")
        }
        Toast.makeText(this, pedido?.nomeCliente, Toast.LENGTH_LONG).show()
    }
}

