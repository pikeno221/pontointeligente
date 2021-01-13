package com.gabs.pontointeligente.infraestructure.client

import com.gabs.pontointeligente.domain.empresa.Empresa
import com.gabs.pontointeligente.infraestructure.repository.EmpresaRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

internal class EmpresaClientTest {

    private val ID_EMPRESA = "ID_EMPRESA"
    private val ID_EMPRESA_NOVA = "ID_EMPRESA_NOVA"
    private val CNPJ = "123456678543"
    private val CNPJ_NOVA = "123456789"
    private val RAZAO_SOCIAL = "RAZAO_SOCIAL"
    private val RAZAO_SOCIAL_NOVA = "RAZAO_SOCIAL_NOVA"

    private val empresaDatabase = Empresa(ID_EMPRESA, RAZAO_SOCIAL, CNPJ)

    private val empresaNova = Empresa(ID_EMPRESA_NOVA, RAZAO_SOCIAL_NOVA, CNPJ_NOVA)


    @Mock
    private lateinit var empresaRepository: EmpresaRepository

    @InjectMocks
    private lateinit var empresaClient: EmpresaClient

    @BeforeEach
    fun init() {
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun deveRetornarNullCasoNaoEncontreEmpresaComCnpjNoBancoDeDados() {

        Mockito.`when`(empresaRepository.findByCnpj(CNPJ))
                .thenReturn(null)

        val buscarPorCnpj = empresaClient.buscarPorCnpj(CNPJ)

        Assertions.assertNull(buscarPorCnpj)


    }

    @Test
    fun deveRetornarEmpresaCasoSejaEncontradaPeloCnpj() {

        Mockito.`when`(empresaRepository.findByCnpj(CNPJ))
                .thenReturn(empresaDatabase)

        val empresaPorCnpj = empresaClient.buscarPorCnpj(CNPJ)

        Assertions.assertNotNull(empresaPorCnpj)

        Assertions.assertEquals(empresaPorCnpj, empresaDatabase)


    }

    @Test
    fun deveChamarRepositoryComEmpresaRecebidaNoParametro() {



        Mockito.`when`(empresaRepository.save(Mockito.any()))
                .thenReturn(empresaNova)

        val empresaPersistida = empresaClient.persistir(empresaNova)

        Assertions.assertEquals(empresaNova, empresaPersistida)

    }

}