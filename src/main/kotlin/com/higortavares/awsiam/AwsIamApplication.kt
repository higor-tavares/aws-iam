package com.higortavares.awsiam

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
class AwsIamApplication

fun main(args: Array<String>) {
	runApplication<AwsIamApplication>(*args)
}
