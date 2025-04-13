package com.vorobevsd.unifiedclientprofilekt.db

import com.vorobevsd.unifiedclientprofilekt.db.entity.Profile
import org.springframework.data.jpa.repository.JpaRepository

interface ProfileRepository : JpaRepository<Profile, Long> {
    fun findByGuid(guid: String): Profile?
}