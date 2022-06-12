package com.adjafsaobraz.coreApplication.ports.out.Aluno

import com.adjafsaobraz.coreApplication.core.domain.Aluno

interface SaveAlunoOut {
    fun saveAluno(aluno: Aluno): Aluno
}