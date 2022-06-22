package com.adjafsaobraz.coreApplication.useCases.Alunos

import com.adjafsaobraz.coreApplication.core.domain.Aluno
import com.adjafsaobraz.coreApplication.ports.`in`.Aluno.GetAlunosIn
import com.adjafsaobraz.coreApplication.ports.out.Aluno.getAlunosOut

class GetAlunosUseCase(private val getAlunosOut: getAlunosOut) : GetAlunosIn {
    override fun getAlunos(): MutableList<Aluno> = getAlunosOut.getAlunos()

}