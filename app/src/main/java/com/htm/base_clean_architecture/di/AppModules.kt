package com.htm.base_clean_architecture.di

import com.htm.data.di.dataModule
import com.htm.domain.di.domainModule
import org.koin.core.module.Module

val appModules: List<Module> = mutableListOf<Module>().apply {
    addAll(dataModule)
    add(domainModule)
    addAll(presentationModule)
}