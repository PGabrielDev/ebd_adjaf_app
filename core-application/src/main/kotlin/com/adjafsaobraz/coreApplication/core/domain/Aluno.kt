package com.adjafsaobraz.coreApplication.core.domain

import java.util.StringJoiner

data class Aluno(val id:String, val nome:String,  val numero: String?, val idade: Int, val classe :Classe)
