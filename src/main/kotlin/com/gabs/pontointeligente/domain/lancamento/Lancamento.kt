package com.gabs.pontointeligente.domain.lancamento

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
class Lancamento(
        @Id val id: String? = null,
        val data: Date,
        val tipo: Tipo,
        val funcionarioId: String,
        val descricao: String? = "",
        val localizacao: String? = ""
)