package com.adjafsaobraz.coreApplication.ports.useCases

import com.adjafsaobraz.coreApplication.core.domain.Classe
import com.adjafsaobraz.coreApplication.core.domain.Usuario
import com.adjafsaobraz.coreApplication.ports.`in`.SaveClasseIn
import com.adjafsaobraz.coreApplication.ports.`in`.SaveUsuarioIn
import com.adjafsaobraz.coreApplication.ports.out.SaveClasseOut
import com.adjafsaobraz.coreApplication.ports.out.SaveUsuarioOut

class SaveUsuarioUseCase(private val saveUsuarioOut: SaveUsuarioOut) : SaveUsuarioIn {

    override fun saveUsuario(usuario: Usuario): Usuario = saveUsuarioOut.saveUsuario(usuario)

}