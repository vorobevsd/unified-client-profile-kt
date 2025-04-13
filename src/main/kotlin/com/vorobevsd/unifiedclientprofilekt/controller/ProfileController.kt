package com.vorobevsd.unifiedclientprofilekt.controller

import com.vorobevsd.unifiedclientprofilekt.dto.ProfileDto
import com.vorobevsd.unifiedclientprofilekt.service.ProfileService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/profile")
class ProfileController(private val profileService: ProfileService) {

    @GetMapping
    fun findProfiles(): List<ProfileDto> = profileService.findProfile()

    @GetMapping("{id}")
    fun findProfileById( @PathVariable id: String): ProfileDto = profileService.findProfileById(id)
}