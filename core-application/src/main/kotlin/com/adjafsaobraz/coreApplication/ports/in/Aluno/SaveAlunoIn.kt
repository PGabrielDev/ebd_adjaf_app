package com.adjafsaobraz.coreApplication.ports.`in`.Aluno

import com.adjafsaobraz.coreApplication.core.domain.Aluno

interface SaveAlunoIn {
    fun saveAluno(aluno: Aluno): Aluno
}