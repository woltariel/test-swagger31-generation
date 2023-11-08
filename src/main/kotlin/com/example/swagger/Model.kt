package com.example.swagger

import io.swagger.v3.oas.annotations.media.Schema

data class Model(val id: String,
                 @Schema(description = "this is a test for ref description in model")
                 val modelChild: ModelChild)

data class ModelChild(val id: String)