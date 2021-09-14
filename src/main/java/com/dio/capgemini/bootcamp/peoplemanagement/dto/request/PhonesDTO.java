package com.dio.capgemini.bootcamp.peoplemanagement.dto.request;

import com.dio.capgemini.bootcamp.peoplemanagement.enums.PhoneTypes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhonesDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneTypes type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}
