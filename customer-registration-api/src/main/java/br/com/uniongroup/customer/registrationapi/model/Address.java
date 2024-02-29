package br.com.uniongroup.customer.registrationapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Embeddable

public class Address {

    @Column(name = "address_zip_code")
    private String zipCode;

    @Column(name = "address_street_name")
    private String streetName;

    @Column(name = "address_number")
    private String number;

    @Column(name = "address_complement")
    private String complement;

    @Column(name = "address_neighborhood")
    private String neighborhood;


    @Column(name = "address_id_city")
    private City city;
}
