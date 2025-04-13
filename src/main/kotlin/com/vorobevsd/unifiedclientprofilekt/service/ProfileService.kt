package com.vorobevsd.unifiedclientprofilekt.service

import com.vorobevsd.unifiedclientprofilekt.db.ProfileRepository
import com.vorobevsd.unifiedclientprofilekt.db.entity.Profile
import com.vorobevsd.unifiedclientprofilekt.dto.ProfileDto
import org.springframework.stereotype.Service

@Service
class ProfileService(private val db: ProfileRepository) {

    fun findProfile(): List<ProfileDto> = db.findAll().map { value -> toDto(value) }
    fun findProfileById(id: String): ProfileDto {
        db.findByGuid(id)?.let { profile: Profile ->
            return toDto(profile)
        }
        return ProfileDto()
    }

}

fun toDto(profile: Profile): ProfileDto {
    return ProfileDto(
        profile.id,
        profile.guid,
        profile.name,
        profile.surname
    )
}