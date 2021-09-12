package com.dio.capgemini.bootcamp.peoplemanagement.entity;

import com.dio.capgemini.bootcamp.peoplemanagement.enums.PhoneTypes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

//@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    private Long id;

    private PhoneTypes type;

    private String number;

}
