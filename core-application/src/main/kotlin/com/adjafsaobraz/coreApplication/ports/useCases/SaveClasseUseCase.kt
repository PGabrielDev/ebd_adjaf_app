package com.adjafsaobraz.coreApplication.ports.useCases

import com.adjafsaobraz.coreApplication.core.domain.Classe
import com.adjafsaobraz.coreApplication.core.domain.Usuario
import com.adjafsaobraz.coreApplication.ports.`in`.SaveClasseIn
import com.adjafsaobraz.coreApplication.ports.`in`.SaveUsuarioIn
import com.adjafsaobraz.coreApplication.ports.out.SaveClasseOut
import com.adjafsaobraz.coreApplication.ports.out.SaveUsuarioOut

class SaveClasseUseCase(private val saveClasseOut: SaveClasseOut ) : SaveClasseIn {

    override fun saveClasse(classe: Classe): Classe = saveClasseOut.saveClasse(classe)


}