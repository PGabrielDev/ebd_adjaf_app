package com.adjafsaobraz.coreApplication.ports.out

import com.adjafsaobraz.coreApplication.core.domain.Classe

interface SaveClasseOut {
    fun saveClasse(classe: Classe): Classe
}