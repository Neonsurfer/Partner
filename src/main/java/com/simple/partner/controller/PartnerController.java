package com.simple.partner.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartnerController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)


}
