package org.example

class JustTesting(
    val nonNullNoPrefix: Boolean,
    val isNonNull: Boolean,
    val nullableNoPrefix: Boolean?,
    val isNullable: Boolean?,
    @get:JvmName("isNullableWithCustomGet") val isNullableWithCustomGet: Boolean
)