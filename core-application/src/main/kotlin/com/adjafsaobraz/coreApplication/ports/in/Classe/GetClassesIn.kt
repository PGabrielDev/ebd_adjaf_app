package com.adjafsaobraz.coreApplication.ports.`in`.Classe

import com.adjafsaobraz.coreApplication.core.domain.Classe

interface GetClassesIn {
    fun getClasses (): MutableList<Classe>
}