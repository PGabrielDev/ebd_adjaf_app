package com.adjafsaobraz.coreApplication.ports.useCases

import com.adjafsaobraz.coreApplication.core.domain.Classe
import com.adjafsaobraz.coreApplication.ports.`in`.GetClassesIn
import com.adjafsaobraz.coreApplication.ports.out.GetClassesOut

class GetClassesUseCase(private val getClassesOut: GetClassesOut) : GetClassesIn {
    override fun getClasses(): MutableList<Classe> = getClassesOut.getClasses()
}