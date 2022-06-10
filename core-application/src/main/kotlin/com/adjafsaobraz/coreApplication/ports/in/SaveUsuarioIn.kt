package com.adjafsaobraz.coreApplication.ports.`in`

import com.adjafsaobraz.coreApplication.core.domain.Usuario

interface SaveUsuarioIn {
    fun saveUsuario(usuario: Usuario): Usuario
}