package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "service_center")
public class ServiceCenter implements Serializable {
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
