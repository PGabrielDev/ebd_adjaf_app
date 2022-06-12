package com.adjafsaobraz.app.outbound.usecases

import com.adjafsaobraz.app.extensions.toClasseDomain
import com.adjafsaobraz.app.outbound.repository.ClasseRepository
import com.adjafsaobraz.coreApplication.core.domain.Classe
import com.adjafsaobraz.coreApplication.ports.out.Classe.FindByIdClasseOut
import org.springframework.stereotype.Service

@Service
class FindByIdClasseAdapter(private val classeRepository: ClasseRepository) : FindByIdClasseOut {

    override fun FindByIdClasse(id: String): Classe {
        return  classeRepository.findById(id).orElseThrow { java.lang.Exception("Classe not found") }.toClasseDomain()
    }
}