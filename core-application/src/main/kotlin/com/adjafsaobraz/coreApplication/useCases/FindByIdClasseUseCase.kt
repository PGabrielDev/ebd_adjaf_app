package com.adjafsaobraz.coreApplication.useCases

import com.adjafsaobraz.coreApplication.core.domain.Classe
import com.adjafsaobraz.coreApplication.ports.`in`.Classe.FindByIdClasseIn
import com.adjafsaobraz.coreApplication.ports.out.Classe.FindByIdClasseOut

class FindByIdClasseUseCase(private val findByIdClasseOut: FindByIdClasseOut) : FindByIdClasseIn {
    override fun FindByIdClasse(id: String): Classe = findByIdClasseOut.FindByIdClasse(id)
}