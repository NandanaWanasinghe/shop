package com.samplepos.possample.Service;


import com.samplepos.possample.entity.request.CustomerSaveRequestDTO;
import com.samplepos.possample.entity.request.CustomerUpdateRequestDTO;

public interface CustomerService {
    String saveCustomer(CustomerSaveRequestDTO customerSaveRequestDTO);

    String UpdateCustomer(CustomerUpdateRequestDTO customerUpdateRequestDTO, int id);
}
