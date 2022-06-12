package com.adjafsaobraz.app.inbound.controllers

import com.adjafsaobraz.coreApplication.core.domain.Classe
import com.adjafsaobraz.coreApplication.ports.`in`.Classe.FindByIdClasseIn
import com.adjafsaobraz.coreApplication.ports.`in`.Classe.GetClassesIn
import com.adjafsaobraz.coreApplication.ports.`in`.Classe.SaveClasseIn
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("classe")
class ClasseController(
    private val saveClasse: SaveClasseIn,
    private val getAllClasses: GetClassesIn,
    private val findByIdClasseIn: FindByIdClasseIn,
) {


    @PostMapping
    fun saveClasse(@RequestBody classe:Classe) : Classe{
        var classe = saveClasse.saveClasse(classe)
        return classe
    }
    @GetMapping
    fun getAllClasses(): MutableList<Classe>{
        var classes = getAllClasses.getClasses()
        return classes
    }

    @GetMapping("/{id}")
    fun getClassById(@PathVariable id:String): Classe {
        var classe = findByIdClasseIn.FindByIdClasse(id)
        return classe
    }





}