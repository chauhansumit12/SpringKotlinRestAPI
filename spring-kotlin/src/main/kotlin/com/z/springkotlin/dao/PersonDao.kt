package com.z.springkotlin.dao

import com.z.springkotlin.domain.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonDao:JpaRepository<Person,Long> {
}