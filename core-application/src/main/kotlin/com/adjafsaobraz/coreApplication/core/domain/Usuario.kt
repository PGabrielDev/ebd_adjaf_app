package com.adjafsaobraz.coreApplication.core.domain

import com.adjafsaobraz.coreApplication.core.domain.enums.Profile
import java.util.StringJoiner

data class Usuario(val id:String?,
                   val nome: String,
                   val email: String,
                   val senha:String,
                   val roles: Set<Profile> = setOf())
