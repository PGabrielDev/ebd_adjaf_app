package com.adjafsaobraz.coreApplication.ports.`in`

import com.adjafsaobraz.coreApplication.core.domain.Classe

interface GetClassesIn {
    fun getClasses (): MutableList<Classe>
}