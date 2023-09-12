package com.samplepos.possample.util.mapper;


import com.samplepos.possample.entity.Customer;
import com.samplepos.possample.entity.request.CustomerSaveRequestDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer RequestDtoToEntity (CustomerSaveRequestDTO customerSaveRequestDTO);
}
