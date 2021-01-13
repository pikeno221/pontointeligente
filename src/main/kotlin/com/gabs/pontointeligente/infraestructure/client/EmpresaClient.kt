package com.gabs.pontointeligente.infraestructure.client

import com.gabs.pontointeligente.domain.empresa.Empresa
import com.gabs.pontointeligente.infraestructure.repository.EmpresaRepository
import org.springframework.stereotype.Component

@Component
class EmpresaClient(val empresaRepository: EmpresaRepository) {

    fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)


}
