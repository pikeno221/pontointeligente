package com.gabs.pontointeligente.domain.funcionario

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Funcionario(
        @Id val id: String? = null,
        val nome: String,
        val senha: String,
        val cpf: String,
        val perfil: Perfil,
        val empresaId: String,
        val valorHora: Double? = 0.0,
        val qtdHorasTrabalhoDia: Float? = 0.0f,
        val qtdHorasAlmoco: Float? = 0.0f,
        val qtdHorasPausa: Float? = 0.0f,
)