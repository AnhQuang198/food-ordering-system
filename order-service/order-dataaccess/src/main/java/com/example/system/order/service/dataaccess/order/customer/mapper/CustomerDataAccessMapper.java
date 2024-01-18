package com.example.system.order.service.dataaccess.order.customer.mapper;

import com.example.domain.valueobject.CustomerId;
import com.example.order.service.domain.entity.Customer;
import com.example.system.order.service.dataaccess.order.customer.entity.CustomerEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataAccessMapper {
    public Customer customerEntityToCustomer(CustomerEntity customerEntity) {
        return new Customer(new CustomerId(customerEntity.getId()));
    }
}
