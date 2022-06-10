package com.adjafsaobraz.coreApplication.ports.out

import com.adjafsaobraz.coreApplication.core.domain.Classe

interface GetClassesOut {
    fun getClasses (): MutableList<Classe>
}