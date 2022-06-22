package com.adjafsaobraz.coreApplication.useCases.Alunos

import com.adjafsaobraz.coreApplication.core.domain.Aluno
import com.adjafsaobraz.coreApplication.ports.`in`.Aluno.SaveAlunoIn
import com.adjafsaobraz.coreApplication.ports.out.Aluno.SaveAlunoOut


class SaveAlunoUseCase(private val saveAlunoOut: SaveAlunoOut) : SaveAlunoIn {

    override fun saveAluno(aluno: Aluno): Aluno = saveAlunoOut.saveAluno(aluno)

}