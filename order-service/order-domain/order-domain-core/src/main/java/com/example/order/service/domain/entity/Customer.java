package com.example.order.service.domain.entity;

import com.example.domain.entity.AggregateRoot;
import com.example.domain.valueobject.CustomerId;

public class Customer extends AggregateRoot<CustomerId> {
    public Customer() {
    }

    public Customer(CustomerId customerId) {
        super.setId(customerId);
    }
}
