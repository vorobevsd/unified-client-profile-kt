package com.vorobevsd.unifiedclientprofilekt.db.entity

import com.vorobevsd.unifiedclientprofilekt.dto.ContactMediumDto
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "contact_medium", schema = "ucp")
class ContactMedium(
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null,
    open var phone: String? = null
) {
    companion object {
        fun fromContactMediumDto(src: ContactMediumDto?): ContactMedium =
            ContactMedium(
                phone = src?.phone
            )
    }
}