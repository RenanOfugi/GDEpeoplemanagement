package com.dio.capgemini.bootcamp.peoplemanagement.mapper;

import com.dio.capgemini.bootcamp.peoplemanagement.dto.request.PersonGdeDTO;
import com.dio.capgemini.bootcamp.peoplemanagement.entity.PersonGDE;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonGDEMapper {

    PersonGDEMapper INSTANCE = Mappers.getMapper(PersonGDEMapper.class);

    //@Mapping()
    PersonGDE toModel(PersonGdeDTO gdeDTO);

    PersonGdeDTO toDTO(PersonGDE personGDE);
}
