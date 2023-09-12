package com.samplepos.possample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {

    private int customerId;
    private String customerName;
    private String customerAddress;
    private ArrayList contactNumber;
    private String nic;
    private boolean activeState;
}
