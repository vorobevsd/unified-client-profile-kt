package com.vorobevsd.unifiedclientprofilekt.dto

import com.vorobevsd.unifiedclientprofilekt.db.entity.Profile

data class ProfileDto(
    val guid: String?,
    val name: String?,
    val surname: String?,
    val contactMedium: Set<ContactMediumDto>?
) {
    companion object {
        fun fromProfile(src: Profile) =
            ProfileDto(
                src.guid,
                src.name,
                src.surname,
                src.contactMedium.map { ContactMediumDto.fromContactMedium(it) }.toSet()
            )
    }
}