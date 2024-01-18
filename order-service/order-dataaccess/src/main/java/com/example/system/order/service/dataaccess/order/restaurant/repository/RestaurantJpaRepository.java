package com.example.system.order.service.dataaccess.order.restaurant.repository;

import com.example.system.order.service.dataaccess.order.restaurant.entity.RestaurantEntity;
import com.example.system.order.service.dataaccess.order.restaurant.entity.RestaurantEntityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface RestaurantJpaRepository extends JpaRepository<RestaurantEntity, RestaurantEntityId> {
    Optional<List<RestaurantEntity>> findByRestaurantIdAndProductIdIn(UUID restaurantId, List<UUID> productIds);
}
