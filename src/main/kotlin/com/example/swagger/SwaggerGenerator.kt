package com.example.swagger

import com.fasterxml.jackson.databind.ObjectMapper
import io.swagger.v3.core.converter.AnnotatedType
import io.swagger.v3.core.converter.ModelConverterContextImpl
import io.swagger.v3.core.jackson.ModelResolver

class SwaggerGenerator {

    private val context = ModelConverterContextImpl(ModelResolver(ObjectMapper()).openapi31(true))


    fun generate() {
        val modelClasses = listOf(Model::class.java, ModelChild::class.java)
        modelClasses.forEach { context.resolve(AnnotatedType(it)) }
        println(context.definedModels)
    }
}