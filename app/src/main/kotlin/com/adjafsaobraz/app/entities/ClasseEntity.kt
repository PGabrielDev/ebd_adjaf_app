package com.adjafsaobraz.app.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "classe")
data class ClasseEntity(
    @Id
    val id:String?,
    val nome:String,
    val alunos:MutableList<AlunoEntity>?
    )

