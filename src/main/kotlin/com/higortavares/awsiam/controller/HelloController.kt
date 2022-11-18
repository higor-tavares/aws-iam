package com.higortavares.awsiam.controller

import com.higortavares.awsiam.service.UploadService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("hello")
class HelloController(private val uploadService: UploadService) {

    @PostMapping("/")
    fun sayHello(@RequestBody text: String) : ResponseEntity<String>{
        val filename = uploadService.uploadText(text)
        return ResponseEntity.ok("The file $filename was successfully saved with text : \"${text}\"");
    }
}