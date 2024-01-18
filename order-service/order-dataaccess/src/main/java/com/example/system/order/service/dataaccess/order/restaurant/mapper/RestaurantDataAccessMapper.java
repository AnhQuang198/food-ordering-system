package com.example.system.order.service.dataaccess.order.restaurant.mapper;

import com.example.domain.valueobject.Money;
import com.example.domain.valueobject.ProductId;
import com.example.domain.valueobject.RestaurantId;
import com.example.order.service.domain.entity.Product;
import com.example.order.service.domain.entity.Restaurant;
import com.example.system.order.service.dataaccess.order.restaurant.entity.RestaurantEntity;
import com.example.system.order.service.dataaccess.order.restaurant.exception.RestaurantDataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class RestaurantDataAccessMapper {
    public List<UUID> restaurantToRestaurantProducts(Restaurant restaurant) {
        return restaurant.getProducts().stream()
                .map(product -> product.getId().getValue())
                .collect(Collectors.toList());
    }

    public Restaurant restaurantEntityToRestaurant(List<RestaurantEntity> restaurantEntities) {
        RestaurantEntity restaurant =
                restaurantEntities.stream().findFirst().orElseThrow(() ->
                        new RestaurantDataAccessException("Restaurant could not be found!"));
        List<Product> restaurantProducts = restaurantEntities.stream().map(entity ->
                new Product(new ProductId(entity.getProductId()), entity.getProductName(),
                        new Money(entity.getProductPrice()))).collect(Collectors.toList());
        return Restaurant.Builder.builder()
                .restaurantId(new RestaurantId(restaurant.getRestaurantId()))
                .products(restaurantProducts)
                .isActive(restaurant.getRestaurantActive())
                .build();
    }
}
