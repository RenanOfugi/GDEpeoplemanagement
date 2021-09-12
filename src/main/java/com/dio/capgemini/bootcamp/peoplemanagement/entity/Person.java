package com.dio.capgemini.bootcamp.peoplemanagement.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private LocalDate birthday;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    private List<Phone> phones;

    @Column(nullable = false)
    private String github;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String googleBiography;
}
