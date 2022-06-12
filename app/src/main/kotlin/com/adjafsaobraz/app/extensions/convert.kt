package com.adjafsaobraz.app.extensions

import com.adjafsaobraz.app.entities.AlunoEntity
import com.adjafsaobraz.app.entities.ClasseEntity
import com.adjafsaobraz.coreApplication.core.domain.Aluno
import com.adjafsaobraz.coreApplication.core.domain.Classe


fun ClasseEntity.toClasseDomain(): Classe {

    return Classe(this.id,this.nome, this.alunos!!.map { it.toAlunoDomain() }.toMutableList())
}

fun AlunoEntity.toAlunoDomain(): Aluno {
    return Aluno(this.id,this.nome,this.numero, this.idade,this.classe.toClasseDomain())
}