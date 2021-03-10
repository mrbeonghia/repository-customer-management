package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void remove(Long id);

    void save(Customer customer);

    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
