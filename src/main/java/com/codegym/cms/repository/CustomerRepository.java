package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);

//    @Query(value = "select * " +
//            "from customer " +
//            "where customer.name like ?", nativeQuery = true)
//    List<Customer> findCustomerByName(String name);

    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
