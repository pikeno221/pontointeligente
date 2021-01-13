package com.gabs.pontointeligente.domain.empresa

import com.gabs.pontointeligente.infraestructure.client.EmpresaClient
import org.springframework.stereotype.Service

@Service
class EmpresaService(val empresaClient: EmpresaClient) {

    fun buscarPorCnpj(cnpj: String): Empresa? = empresaClient.buscarPorCnpj(cnpj)

    fun persistir(empresa: Empresa): Empresa {
        return empresaClient.persistir(empresa)

    }


}
