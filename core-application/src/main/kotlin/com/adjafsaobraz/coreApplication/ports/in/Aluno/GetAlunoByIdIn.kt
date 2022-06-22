package com.adjafsaobraz.coreApplication.ports.`in`.Aluno

import com.adjafsaobraz.coreApplication.core.domain.Aluno

interface GetAlunoByIdIn {

    fun getAlunoById(id: String): Aluno
}