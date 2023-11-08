package org.hibernate.inheritance.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bike")
@Getter
@Setter
@NoArgsConstructor
public class TwoWheeler extends Vehicle {
    private String streeingHandler;



    public TwoWheeler(String vehicleName, String streeingHandler) {
        super(vehicleName);
        this.streeingHandler = streeingHandler;
    }
}
