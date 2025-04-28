package com.vorobevsd.unifiedclientprofilekt.controller

import com.vorobevsd.unifiedclientprofilekt.dto.ProfileDto
import com.vorobevsd.unifiedclientprofilekt.service.ProfileService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/profile")
class ProfileController(private val profileService: ProfileService) {

    @GetMapping
    fun findProfiles(): List<ProfileDto> = profileService.findProfile()
    @GetMapping("{id}")
    fun findProfileById( @PathVariable id: String): ProfileDto? = profileService.findProfileById(id)
    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE],  produces = [MediaType.APPLICATION_JSON_VALUE])
    fun createProfile( @RequestBody request: ProfileDto?) : String? = profileService.createProfile(request)
    @PatchMapping("{id}", consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun updateProfile( @RequestBody request: ProfileDto?) : String? = profileService.updateProfile(request)
}