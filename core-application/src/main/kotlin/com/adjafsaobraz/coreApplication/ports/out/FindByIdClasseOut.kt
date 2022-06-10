package com.adjafsaobraz.coreApplication.ports.out

import com.adjafsaobraz.coreApplication.core.domain.Classe
import java.util.Optional

interface FindByIdClasseOut {
    fun FindByIdClasse(id:String): Optional<Classe>
}