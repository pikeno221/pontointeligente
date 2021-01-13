package com.gabs.pontointeligente.utils

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

internal class SenhaUtilTest {

    private val SENHA = "123456"
    private val bCryptEncoder = BCryptPasswordEncoder()

    
    @Test
    fun testGerarSenhaComHashBCrypty() {

        val hash = SenhaUtil().gerarSenhaBcrypt(SENHA)

        Assertions.assertTrue(bCryptEncoder.matches(SENHA, hash))

    }

}