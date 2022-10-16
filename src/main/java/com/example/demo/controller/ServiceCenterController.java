package com.example.demo.controller;

import com.example.demo.exceptions.BadRequestException;
import com.example.demo.model.ServiceCenter;
import com.example.demo.service.ServiceCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class ServiceCenterController {
    @Autowired
    public ServiceCenterService service;

    @GetMapping("/{id}")
    public ServiceCenter getServiceCenterById(@PathVariable Integer id) {
        return service.fetchServiceCenterDetails(id);
    }

    @PostMapping("/{id}")
    public ServiceCenter createServiceCenter(@PathVariable Integer id, @RequestBody ServiceCenter serviceCenter) {
        if(!id.equals(serviceCenter.getServiceCenterId())) throw new BadRequestException("Id didn't match");

        return service.createServiceCenter(serviceCenter);
    }

    @DeleteMapping("/{id}")
    public void deleteServiceCenter(@PathVariable Integer id) {
        service.deleteServiceCenter(id);
    }

    @GetMapping("/get_all")
    public List<ServiceCenter> getAllServiceCenters() {
        return service.getAllServiceCenters();
    }
}
