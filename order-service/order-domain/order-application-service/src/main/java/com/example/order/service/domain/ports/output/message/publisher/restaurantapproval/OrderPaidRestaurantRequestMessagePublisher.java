package com.example.order.service.domain.ports.output.message.publisher.restaurantapproval;

import com.example.domain.event.publisher.DomainEventPublisher;
import com.example.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
