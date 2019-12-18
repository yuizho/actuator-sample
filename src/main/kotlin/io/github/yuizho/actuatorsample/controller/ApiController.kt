package io.github.yuizho.actuatorsample.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class ApiController {
    @GetMapping("/users")
    fun users(): List<String> = listOf("岩鬼正美", "山田太郎", "殿馬一人", "里中智")

    @GetMapping("/users/{id}")
    fun users(@PathVariable id: String): String = "山田太郎"
}