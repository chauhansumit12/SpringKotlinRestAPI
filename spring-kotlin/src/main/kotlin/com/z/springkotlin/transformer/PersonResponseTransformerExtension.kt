package com.z.springkotlin.transformer

import com.z.springkotlin.domain.Person
import com.z.springkotlin.dto.PersonResponse


fun Person?.toPersonResponse(): PersonResponse {
    return  PersonResponse(
        id = this?.id?:1L,
        fullName ="${this?.name} ${this?.lastName}"
    )

}