package com.samplepos.possample.repo;


import com.samplepos.possample.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@EnableJpaRepositories
@Transactional
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    @Modifying
    @Query(value = "update Customer set customer_name=?1, customer_address=?2,nic=?3 where customer_id=?4", nativeQuery = true)
    void updateCustomer(String customerName, String customerAddress, String nic, int id);
}

