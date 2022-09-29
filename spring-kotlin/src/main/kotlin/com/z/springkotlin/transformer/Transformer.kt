package com.z.springkotlin.transformer

interface Transformer<A,B> {
    fun transform(source: A): B

}