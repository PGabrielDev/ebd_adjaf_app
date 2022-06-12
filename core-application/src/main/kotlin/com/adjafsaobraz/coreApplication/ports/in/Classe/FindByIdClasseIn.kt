package com.adjafsaobraz.coreApplication.ports.`in`.Classe

import com.adjafsaobraz.coreApplication.core.domain.Classe
import java.util.Optional

interface FindByIdClasseIn {
    fun FindByIdClasse(id:String): Classe
}