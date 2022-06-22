package com.adjafsaobraz.coreApplication.ports.`in`.Aluno

import com.adjafsaobraz.coreApplication.core.domain.Aluno

interface GetAlunosIn {
    fun getAlunos () : MutableList<Aluno>
}