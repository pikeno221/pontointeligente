package com.gabs.pontointeligente.infraestructure.repository

import com.gabs.pontointeligente.domain.empresa.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {

    fun findByCnpj(cpnj: String): Empresa?

}