package com.example.order.service.domain.mapper;

import com.example.domain.valueobject.CustomerId;
import com.example.domain.valueobject.Money;
import com.example.domain.valueobject.ProductId;
import com.example.domain.valueobject.RestaurantId;
import com.example.order.service.domain.dto.create.CreateOrderCommand;
import com.example.order.service.domain.dto.create.CreateOrderResponse;
import com.example.order.service.domain.dto.create.OrderAddress;
import com.example.order.service.domain.entity.Order;
import com.example.order.service.domain.entity.OrderItem;
import com.example.order.service.domain.entity.Product;
import com.example.order.service.domain.entity.Restaurant;
import com.example.order.service.domain.valueobject.StreetAddress;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class OrderDataMapper {
    public Restaurant createOrderCommandToRestaurant(CreateOrderCommand createOrderCommand) {
        return Restaurant.Builder.builder()
                .restaurantId(new RestaurantId(createOrderCommand.getRestaurantId()))
                .products(createOrderCommand.getItems().stream().map(orderItem ->
                        new Product(new ProductId(orderItem.getProductId()))).collect(Collectors.toList()))
                .build();
    }

    //thay bang factory pattern de mapper
    public Order createOrderCommandToOrder(CreateOrderCommand createOrderCommand) {
        return Order.Builder.builder()
                .customerId(new CustomerId(createOrderCommand.getCustomerId()))
                .restaurantId(new RestaurantId(createOrderCommand.getRestaurantId()))
                .deliveryAddress(orderAddressToStreetAddress(createOrderCommand.getAddress()))
                .price(new Money(createOrderCommand.getPrice()))
                .items(orderItemsToOrderItemEntities(createOrderCommand.getItems()))
                .build();
    }

    private List<OrderItem> orderItemsToOrderItemEntities(List<com.example.order.service.domain.dto.create.OrderItem> items) {
        return items.stream().map(orderItem ->
                OrderItem.Builder.builder()
                        .product(new Product(new ProductId(orderItem.getProductId())))
                        .price(new Money(orderItem.getPrice()))
                        .quantity(orderItem.getQuantity())
                        .subTotal(new Money(orderItem.getSubTotal()))
                        .build()).collect(Collectors.toList());
    }

    public CreateOrderResponse orderToCreateOrderResponse(Order order) {
        return CreateOrderResponse.builder()
                .orderTrackingId(order.getTrackingId().getValue())
                .orderStatus(order.getOrderStatus())
                .build();
    }

    private StreetAddress orderAddressToStreetAddress(OrderAddress address) {
        return new StreetAddress(
                UUID.randomUUID(),
                address.getStreet(),
                address.getPostalCode(),
                address.getCity()
        );
    }
}
