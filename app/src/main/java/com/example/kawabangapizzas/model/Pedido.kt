package com.example.kawabangapizzas.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pedido(
    val nomeCliente: String,
    val sabores: List<String>,
    val tamanho: String,
    val tipoPagamento: String
) : Parcelable