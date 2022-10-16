package com.example.demo.service;

import com.example.demo.model.ServiceCenter;
import com.example.demo.repository.ServiceCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCenterService {
    @Autowired
    ServiceCenterRepository repository;

    public ServiceCenter fetchServiceCenterDetails(Integer id) {
       return repository.getReferenceById(id);
    }
}
