package com.higortavares.awsiam.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import software.amazon.awssdk.core.sync.RequestBody
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client
import software.amazon.awssdk.services.s3.model.PutObjectRequest
import java.util.UUID;

@Service
class UploadService {
    private val region = Region.US_EAST_1
    private val s3 = S3Client.builder().region(region).build();
    @Value("\${bucket}") private lateinit var bucketName: String;

    fun uploadText(text: String) : String {
        val filename = "${UUID.randomUUID().toString()}.txt"
        s3.putObject(PutObjectRequest.builder().bucket(bucketName).key(filename)
            .build(),
            RequestBody.fromString(text));
        return filename;
    }
}