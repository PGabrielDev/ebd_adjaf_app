package com.adjafsaobraz.coreApplication.ports.`in`

import com.adjafsaobraz.coreApplication.core.domain.Classe
import java.util.Optional

interface FindByIdClasseIn {
    fun FindByIdClasse(id:String): Optional<Classe>
}