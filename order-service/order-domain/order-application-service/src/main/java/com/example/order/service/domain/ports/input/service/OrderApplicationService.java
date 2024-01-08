package com.example.order.service.domain.ports.input.service;

import com.example.order.service.domain.dto.create.CreateOrderCommand;
import com.example.order.service.domain.dto.create.CreateOrderResponse;
import com.example.order.service.domain.dto.track.TrackOrderQuery;
import com.example.order.service.domain.dto.track.TrackOrderResponse;

import javax.validation.Valid;

public interface OrderApplicationService {
    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
