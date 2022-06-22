package com.adjafsaobraz.coreApplication.useCases.Classes

import com.adjafsaobraz.coreApplication.core.domain.Classe
import com.adjafsaobraz.coreApplication.ports.`in`.Classe.SaveClasseIn
import com.adjafsaobraz.coreApplication.ports.out.Classe.SaveClasseOut

class SaveClasseUseCase(private val saveClasseOut: SaveClasseOut) : SaveClasseIn {

    override fun saveClasse(classe: Classe): Classe = saveClasseOut.saveClasse(classe)


}