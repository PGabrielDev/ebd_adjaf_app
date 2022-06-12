package com.adjafsaobraz.coreApplication.ports.`in`.Aluno

import com.adjafsaobraz.coreApplication.core.domain.Aluno

interface getAlunoByIdIn {

    fun getAlunoById(id: String): Aluno
}