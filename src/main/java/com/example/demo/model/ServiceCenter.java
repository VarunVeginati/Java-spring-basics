package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "service_center")
public class ServiceCenter {
    @Id
    @Column(name="service_center_id")
    private Integer serviceCenterId;

    @Column(name = "address")
    private String address;

    @Column(name = "telephone_number")
    private String telephoneNumber;

    @Column(name = "open_on_saturday")
    private Boolean openOnSaturday;
}
