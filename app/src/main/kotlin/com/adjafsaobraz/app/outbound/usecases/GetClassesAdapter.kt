package com.adjafsaobraz.app.outbound.usecases

import com.adjafsaobraz.app.extensions.toClasseDomain
import com.adjafsaobraz.app.outbound.repository.ClasseRepository
import com.adjafsaobraz.coreApplication.core.domain.Classe
import com.adjafsaobraz.coreApplication.ports.out.Classe.GetClassesOut
import org.springframework.stereotype.Service

@Service
class GetClassesAdapter(private val classeRepository: ClasseRepository) : GetClassesOut {

    override fun getClasses(): MutableList<Classe> {
        var classes = classeRepository.findAll()
        var classesDomain = classes.map { it.toClasseDomain() }.toMutableList()
        return  classesDomain
    }
}