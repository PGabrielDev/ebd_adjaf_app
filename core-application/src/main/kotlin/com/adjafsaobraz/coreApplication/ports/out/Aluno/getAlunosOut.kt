package com.adjafsaobraz.coreApplication.ports.out.Aluno

import com.adjafsaobraz.coreApplication.core.domain.Aluno

interface getAlunosOut {
    fun getAlunos () : MutableList<Aluno>
}