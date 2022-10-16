package com.example.demo.controller;

import com.example.demo.model.ServiceCenter;
import com.example.demo.service.ServiceCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceCenterController {
    @Autowired
    public ServiceCenterService service;

    @GetMapping("/{id}")
    public ServiceCenter getServiceCenterById(@PathVariable Integer id) {
        return service.fetchServiceCenterDetails(id);
    }
}
