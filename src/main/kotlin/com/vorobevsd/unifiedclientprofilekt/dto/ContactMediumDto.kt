package com.vorobevsd.unifiedclientprofilekt.dto

import com.vorobevsd.unifiedclientprofilekt.db.entity.ContactMedium

data class ContactMediumDto(
    val phone: String?
) {
    companion object {
        fun fromContactMedium(src: ContactMedium) =
            ContactMediumDto(
                src.phone
            )
    }
}