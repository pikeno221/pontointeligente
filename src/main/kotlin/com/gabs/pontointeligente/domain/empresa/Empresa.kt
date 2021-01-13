package com.gabs.pontointeligente.domain.empresa

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Empresa(
        @Id val id: String? = null,
        val razaoSocial: String,
        val cnpj: String
)