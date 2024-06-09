package com.example.kafkademo.mapper;

import com.example.kafkademo.dto.DataDto;
import com.example.kafkademo.entity.Data;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface DataMapper {
    Data toEntity(DataDto dataDto);

    DataDto toDto(Data data);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Data partialUpdate(DataDto dataDto, @MappingTarget Data data);
}