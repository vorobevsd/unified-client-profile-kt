package com.vorobevsd.unifiedclientprofilekt.db.entity

import com.vorobevsd.unifiedclientprofilekt.dto.ProfileDto
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "profile", schema = "ucp")
class Profile(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null,
    open var guid: String? = null,
    open var name: String? = null,
    open var surname: String? = null,
    @OneToMany
    @JoinColumn(name = "profile_id")
    open var contactMedium: MutableSet<ContactMedium> = mutableSetOf()
) {
    companion object{
        fun fromProfileDto(profileDto: ProfileDto?): Profile =
            Profile(
                guid = profileDto?.guid,
                name = profileDto?.name,
                surname = profileDto?.surname,
                contactMedium = profileDto?.contactMedium?.map { ContactMedium.fromContactMediumDto(it) }?.toMutableSet()?: mutableSetOf()
            )
    }
}