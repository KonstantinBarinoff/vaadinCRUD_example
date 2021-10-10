package com.example.crowd1.domain;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    private String firstName;
    private String lastName;
    private String patronymic;
}
