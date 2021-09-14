package com.dio.capgemini.bootcamp.peoplemanagement.dto.request;

import com.dio.capgemini.bootcamp.peoplemanagement.entity.Phone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonGdeDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 30)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 30)
    private String lastName;

    private LocalDate birthday;

    @Valid
    @NotEmpty
    private List<Phone> phones;

    @NotEmpty
    private String github;

    @NotEmpty
    private String category;

    @NotEmpty
    private String googleBiography;
}
