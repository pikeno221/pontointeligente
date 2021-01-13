package com.gabs.pontointeligente.infraestructure.repository

import com.gabs.pontointeligente.domain.funcionario.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String> {

    fun findByEmail(email: String): Funcionario?

    fun findByCpf(cpf: String): Funcionario?

}