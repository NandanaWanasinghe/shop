package com.samplepos.possample.Controller;

import com.samplepos.possample.Service.CustomerService;
import com.samplepos.possample.entity.request.CustomerSaveRequestDTO;
import com.samplepos.possample.entity.request.CustomerUpdateRequestDTO;
import com.samplepos.possample.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save-Customer")
    public ResponseEntity<StandardResponse>saveCustomer(@RequestBody CustomerSaveRequestDTO customerSaveRequestDTO){
        String addCustomer = customerService.saveCustomer(customerSaveRequestDTO);
        return new ResponseEntity<>(
                new StandardResponse(201, customerSaveRequestDTO.getCustomerName() + " saved successfully", addCustomer),
                HttpStatus.CREATED
        );
    }
    @PutMapping(path = "/update-customer/{id}")
    public ResponseEntity<StandardResponse>UpdateCustomer(@RequestBody CustomerUpdateRequestDTO customerUpdateRequestDTO, @PathVariable(value = "id") int id){
        String update = customerService.UpdateCustomer(customerUpdateRequestDTO,id);
        return new ResponseEntity<>(
                new StandardResponse(201, " update successfully", update),
                HttpStatus.CREATED
        );
    }
}

