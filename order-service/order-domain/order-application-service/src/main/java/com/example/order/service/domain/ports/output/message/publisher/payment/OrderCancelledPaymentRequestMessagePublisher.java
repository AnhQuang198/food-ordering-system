package com.example.order.service.domain.ports.output.message.publisher.payment;

import com.example.domain.event.publisher.DomainEventPublisher;
import com.example.order.service.domain.event.OrderCancelledEvent;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
