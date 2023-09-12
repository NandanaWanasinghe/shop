package com.samplepos.possample.Service.impl;


import com.samplepos.possample.Exception.NotFoundException;
import com.samplepos.possample.Service.CustomerService;
import com.samplepos.possample.entity.Customer;
import com.samplepos.possample.entity.request.CustomerSaveRequestDTO;
import com.samplepos.possample.entity.request.CustomerUpdateRequestDTO;
import com.samplepos.possample.repo.CustomerRepo;
import com.samplepos.possample.util.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public String saveCustomer(CustomerSaveRequestDTO customerSaveRequestDTO) {
        Customer customer = customerMapper.RequestDtoToEntity(customerSaveRequestDTO);
        if (!customerRepo.existsById(customer.getCustomerId())){
            return customerRepo.save(customer).getCustomerName();
        }
        else
            throw new NotFoundException("already Exist !");
    }

    @Override
    public String UpdateCustomer(CustomerUpdateRequestDTO customerUpdateRequestDTO, int id) {
        if (customerRepo.existsById(id)){
            customerRepo.updateCustomer(customerUpdateRequestDTO.getCustomerName(),customerUpdateRequestDTO.getCustomerAddress(),customerUpdateRequestDTO.getNic(),id);
            return customerUpdateRequestDTO.getCustomerName();
        }
        else
            throw new NotFoundException("invalied Id");
    }
}