package com.z.springkotlin.dto

data class UpdatePersonRequest (val id:Long,val name:String,val lastName:String?=null)