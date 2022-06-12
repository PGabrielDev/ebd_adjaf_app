package com.adjafsaobraz.coreApplication.ports.out.Classe

import com.adjafsaobraz.coreApplication.core.domain.Classe

interface SaveClasseOut {
    fun saveClasse(classe: Classe): Classe
}