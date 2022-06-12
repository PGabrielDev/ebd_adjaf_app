package com.adjafsaobraz.coreApplication.ports.`in`.Classe

import com.adjafsaobraz.coreApplication.core.domain.Classe

interface SaveClasseIn {
    fun saveClasse(classe: Classe): Classe
}