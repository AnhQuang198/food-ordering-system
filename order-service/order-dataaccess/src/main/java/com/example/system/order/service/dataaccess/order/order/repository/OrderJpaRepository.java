package com.example.system.order.service.dataaccess.order.order.repository;

import com.example.system.order.service.dataaccess.order.order.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderJpaRepository extends JpaRepository<OrderEntity, UUID> {

}
