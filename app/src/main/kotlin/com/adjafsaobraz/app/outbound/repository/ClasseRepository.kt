package com.adjafsaobraz.app.outbound.repository

import com.adjafsaobraz.app.entities.ClasseEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ClasseRepository : MongoRepository<ClasseEntity, String> {
}