package com.example.demo.http;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/upload")
public class UploadResource {

    @PostMapping
    public void executeUpload(@RequestPart(name = "file") MultipartFile file) {

        System.out.println(file.getContentType().length());
    }
}
