package com.vorobevsd.unifiedclientprofilekt.dto

data class ProfileDto(
    val id: Long?,
    val guid: String?,
    val name: String?,
    val surname: String?
){
    constructor() : this(null, null, null, null)
}