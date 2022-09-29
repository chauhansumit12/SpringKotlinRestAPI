package com.z.springkotlin.service

import com.z.springkotlin.dto.AddPersonRequest
import com.z.springkotlin.dto.PersonResponse
import com.z.springkotlin.dto.UpdatePersonRequest


interface PersonManagementService {
    fun findById(id:Long):PersonResponse?
    fun findAll():List<PersonResponse>
    fun save(addPersonRequest: AddPersonRequest):PersonResponse
    fun update(updatePersonRequest: UpdatePersonRequest):PersonResponse
    fun deleteById(id:Long)

}