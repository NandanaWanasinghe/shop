package com.samplepos.possample.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerUpdateRequestDTO {
    private String customerName;
    private String customerAddress;
    private String nic;
}
