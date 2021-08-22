package com.app.ecommerce.utils;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import javax.persistence.Entity;

@Mapper(componentModel = "spring")
public interface ModelMapper<D,E> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateModelFromDTO(D dto, @MappingTarget E entity);

}
