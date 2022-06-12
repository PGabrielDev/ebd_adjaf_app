package com.adjafsaobraz.app.configuration

import com.adjafsaobraz.app.outbound.usecases.FindByIdClasseAdapter
import com.adjafsaobraz.app.outbound.usecases.GetClassesAdapter
import com.adjafsaobraz.app.outbound.usecases.SaveClasseAdapter
import com.adjafsaobraz.coreApplication.useCases.FindByIdClasseUseCase
import com.adjafsaobraz.coreApplication.useCases.GetClassesUseCase
import com.adjafsaobraz.coreApplication.useCases.SaveClasseUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConfigAdapters {

    @Bean
    fun saveClasseUseCase (saveClasseAdapter: SaveClasseAdapter): SaveClasseUseCase{
        return SaveClasseUseCase(saveClasseAdapter)
    }
    @Bean
    fun getClasses (getClassesAdapter: GetClassesAdapter): GetClassesUseCase {
        return GetClassesUseCase(getClassesAdapter)
    }

    @Bean
    fun getClasseById(findByIdClasseAdapter: FindByIdClasseAdapter): FindByIdClasseUseCase {
        return FindByIdClasseUseCase(findByIdClasseAdapter)
    }


}