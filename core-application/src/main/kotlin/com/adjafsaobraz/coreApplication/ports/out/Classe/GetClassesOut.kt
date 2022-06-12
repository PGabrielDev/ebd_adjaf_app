package com.adjafsaobraz.coreApplication.ports.out.Classe

import com.adjafsaobraz.coreApplication.core.domain.Classe

interface GetClassesOut {
    fun getClasses (): MutableList<Classe>
}