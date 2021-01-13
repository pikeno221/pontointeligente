package com.gabs.pontointeligente.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SenhaUtil {

    fun gerarSenhaBcrypt(senha: String): String = BCryptPasswordEncoder().encode(senha)

}