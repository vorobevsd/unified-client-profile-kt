package com.vorobevsd.unifiedclientprofilekt.db.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "Profile")
data class Profile(
    @Id
    @GeneratedValue
    val id: Long,
    val guid: String,
    val name: String,
    val surname: String
)