package com.yannbytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "customer") //Just needed if the table name is different than class name
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increment
    @Column(name="customer_id") //Just needed if the column name is different than variable name in this case yes
    private Long customerId;


    private String name;
    private String email;

    @Column(name="mobile_number")
    private String mobileNumber;
}
