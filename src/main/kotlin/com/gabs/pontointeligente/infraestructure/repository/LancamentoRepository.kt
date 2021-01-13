package com.gabs.pontointeligente.infraestructure.repository

import com.gabs.pontointeligente.domain.funcionario.Funcionario
import com.gabs.pontointeligente.domain.lancamento.Lancamento
import org.springframework.data.mongodb.repository.MongoRepository
import java.awt.print.Pageable

interface LancamentoRepository : MongoRepository<Lancamento, String> {

    fun findByFuncionarioId(funcionarioId: String, pageable: Pageable): Lancamento

}