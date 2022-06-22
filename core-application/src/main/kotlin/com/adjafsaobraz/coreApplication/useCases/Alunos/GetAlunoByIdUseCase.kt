package com.adjafsaobraz.coreApplication.useCases.Alunos

import com.adjafsaobraz.coreApplication.core.domain.Aluno
import com.adjafsaobraz.coreApplication.ports.`in`.Aluno.GetAlunoByIdIn
import com.adjafsaobraz.coreApplication.ports.out.Aluno.getAlunoByIdOut

class GetAlunoByIdUseCase(private val getalunoByIdOut: getAlunoByIdOut) : GetAlunoByIdIn {
    override fun getAlunoById(id: String): Aluno  = getalunoByIdOut.getAlunoById(id)
}