package com.adjafsaobraz.coreApplication.useCases

import com.adjafsaobraz.coreApplication.core.domain.Usuario
import com.adjafsaobraz.coreApplication.ports.`in`.Classe.SaveUsuarioIn
import com.adjafsaobraz.coreApplication.ports.out.Classe.SaveUsuarioOut

class SaveUsuarioUseCase(private val saveUsuarioOut: SaveUsuarioOut) : SaveUsuarioIn {

    override fun saveUsuario(usuario: Usuario): Usuario = saveUsuarioOut.saveUsuario(usuario)

}