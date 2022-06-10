package com.adjafsaobraz.coreApplication.ports.useCases

import com.adjafsaobraz.coreApplication.core.domain.Classe
import com.adjafsaobraz.coreApplication.ports.`in`.FindByIdClasseIn
import com.adjafsaobraz.coreApplication.ports.out.FindByIdClasseOut
import java.util.*

class FindByIdClasseUseCase(private val findByIdClasseOut: FindByIdClasseOut) : FindByIdClasseIn {
    override fun FindByIdClasse(id: String): Optional<Classe> = findByIdClasseOut.FindByIdClasse(id)
}