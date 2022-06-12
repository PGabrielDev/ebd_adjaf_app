package com.adjafsaobraz.app.outbound.usecases

import com.adjafsaobraz.app.entities.ClasseEntity
import com.adjafsaobraz.app.outbound.repository.ClasseRepository
import com.adjafsaobraz.coreApplication.core.domain.Classe
import com.adjafsaobraz.coreApplication.ports.out.Classe.SaveClasseOut
import org.springframework.stereotype.Service

@Service
class SaveClasseAdapter(private val classeRepository: ClasseRepository) : SaveClasseOut {
    override fun saveClasse(classe: Classe): Classe {
        var classeEntity = ClasseEntity(id = classe.id,nome = classe.nome , alunos = mutableListOf())
        classeRepository.save(classeEntity)
        return  classe
    }
}