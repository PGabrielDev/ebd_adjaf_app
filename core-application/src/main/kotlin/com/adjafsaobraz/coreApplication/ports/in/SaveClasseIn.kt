package com.adjafsaobraz.coreApplication.ports.`in`

import com.adjafsaobraz.coreApplication.core.domain.Classe

interface SaveClasseIn {
    fun saveClasse(classe: Classe): Classe
}