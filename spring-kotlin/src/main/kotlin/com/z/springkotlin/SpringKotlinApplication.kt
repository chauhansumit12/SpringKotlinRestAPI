package com.z.springkotlin

import com.z.springkotlin.domain.Person
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SpringKotlinApplication{

	@GetMapping
	fun hi():Person{
		return Person(lastName="Chauhan",name="Sumit")
	}
}

fun main(args: Array<String>) {
	runApplication<SpringKotlinApplication>(*args)
}
