package com.adjafsaobraz.coreApplication.useCases

import com.adjafsaobraz.coreApplication.core.domain.Classe
import com.adjafsaobraz.coreApplication.ports.`in`.Classe.GetClassesIn
import com.adjafsaobraz.coreApplication.ports.out.Classe.GetClassesOut

class GetClassesUseCase(private val getClassesOut: GetClassesOut) : GetClassesIn {
    override fun getClasses(): MutableList<Classe> = getClassesOut.getClasses()
}