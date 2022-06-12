package com.adjafsaobraz.coreApplication.ports.out.Classe

import com.adjafsaobraz.coreApplication.core.domain.Classe
import java.util.Optional

interface FindByIdClasseOut {
    fun FindByIdClasse(id:String): Classe
}