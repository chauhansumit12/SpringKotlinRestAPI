package com.z.springkotlin.transformer

import com.z.springkotlin.domain.Person
import com.z.springkotlin.dto.AddPersonRequest
import com.z.springkotlin.service.PersonManagementService
import org.springframework.stereotype.Component

@Component
class AddPersonRequestTransformer: Transformer<AddPersonRequest, Person> {
    override fun transform(source: AddPersonRequest): Person {
        return Person(
            name=source.name,
            lastName=source.lastName
        )
    }
}