package com.example.demo.service;

import com.example.demo.exceptions.NotFoundException;
import com.example.demo.model.ServiceCenter;
import com.example.demo.repository.ServiceCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCenterService {
    @Autowired
    ServiceCenterRepository repository;

    public ServiceCenter fetchServiceCenterDetails(Integer id) {
        return repository.findById(id).orElseThrow(()-> {throw new NotFoundException("Service Center not found");});
    }

    public ServiceCenter createServiceCenter(ServiceCenter serviceCenter) {
        return repository.save(serviceCenter);
    }

    public void deleteServiceCenter(Integer id) {
        repository.findById(id).orElseThrow(()->{throw new NotFoundException("Service Center not found");});

        repository.deleteById(id);
    }

    public List<ServiceCenter> getAllServiceCenters() {
        return repository.findAll();
    }
}
