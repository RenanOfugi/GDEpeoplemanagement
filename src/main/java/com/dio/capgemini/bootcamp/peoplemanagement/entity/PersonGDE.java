package com.dio.capgemini.bootcamp.peoplemanagement.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
//@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PersonGDE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private LocalDate birthday;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    @ToString.Exclude
    private List<Phone> phones;

    @Column(nullable = false)
    private String github;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String googleBiography;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PersonGDE personGDE = (PersonGDE) o;
        return Objects.equals(id, personGDE.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
