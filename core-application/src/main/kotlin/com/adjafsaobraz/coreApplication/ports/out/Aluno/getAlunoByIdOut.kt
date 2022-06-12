package com.adjafsaobraz.coreApplication.ports.out.Aluno

import com.adjafsaobraz.coreApplication.core.domain.Aluno

interface getAlunoByIdOut {

    fun getAlunoById(id: String): Aluno
}