package com.samplepos.possample.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerSaveRequestDTO {

    private String customerName;
    private String customerAddress;
    private ArrayList contactNumber;
    private String nic;
    private boolean activeState;
}
