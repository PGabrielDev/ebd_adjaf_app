package com.adjafsaobraz.app.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class AlunoEntity(
    @Id
    val id:String,
    val nome:String,
    val numero: String?,
    val idade: Int,
    val classe :ClasseEntity)
