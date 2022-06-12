package com.adjafsaobraz.coreApplication.ports.out.Classe

import com.adjafsaobraz.coreApplication.core.domain.Usuario

interface SaveUsuarioOut {
    fun saveUsuario(usuario: Usuario): Usuario
}