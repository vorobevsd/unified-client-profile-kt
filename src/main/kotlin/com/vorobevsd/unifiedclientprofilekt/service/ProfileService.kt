package com.vorobevsd.unifiedclientprofilekt.service

import com.vorobevsd.unifiedclientprofilekt.db.ProfileRepository
import com.vorobevsd.unifiedclientprofilekt.db.entity.Profile
import com.vorobevsd.unifiedclientprofilekt.dto.ProfileDto
import org.springframework.stereotype.Service

@Service
class ProfileService(private val db: ProfileRepository) {

    fun findProfile(): List<ProfileDto> = db.findAll().map { ProfileDto.fromProfile(it) }
    fun findProfileById(id: String): ProfileDto? = db.findByGuid(id)?.let { ProfileDto.fromProfile(it) }
    fun createProfile(request: ProfileDto?): String? = Profile.fromProfileDto(request).let { db.save(it) }.guid
    fun updateProfile(request: ProfileDto?): String? {
        TODO("Not yet implemented")
    }
}