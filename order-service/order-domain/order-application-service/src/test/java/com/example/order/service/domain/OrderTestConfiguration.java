//package com.example.order.service.domain;
//
//import com.example.order.service.domain.ports.output.message.publisher.payment.OrderCancelledPaymentRequestMessagePublisher;
//import com.example.order.service.domain.ports.output.message.publisher.payment.OrderCreatedPaymentRequestMessagePublisher;
//import com.example.order.service.domain.ports.output.message.publisher.restaurantapproval.OrderPaidRestaurantRequestMessagePublisher;
//import com.example.order.service.domain.ports.output.repository.CustomerRepository;
//import com.example.order.service.domain.ports.output.repository.RestaurantRepository;
//import org.mockito.Mockito;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication(scanBasePackages = "com.example.order.service.domain")
//public class OrderTestConfiguration {
//    @Bean
//    public OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher() {
//        return Mockito.mock(OrderCreatedPaymentRequestMessagePublisher.class);
//    }
//
//    @Bean
//    public OrderCancelledPaymentRequestMessagePublisher orderCancelledPaymentRequestMessagePublisher() {
//        return Mockito.mock(OrderCancelledPaymentRequestMessagePublisher.class);
//    }
//
//    @Bean
//    public OrderPaidRestaurantRequestMessagePublisher orderPaidRestaurantRequestMessagePublisher() {
//        return Mockito.mock(OrderPaidRestaurantRequestMessagePublisher.class);
//    }
//
//    @Bean
//    public CustomerRepository customerRepository() {
//        return Mockito.mock(CustomerRepository.class);
//    }
//
//    @Bean
//    public RestaurantRepository restaurantRepository() {
//        return Mockito.mock(RestaurantRepository.class);
//    }
//
//    @Bean
//    public OrderDomainService orderDomainService() {
//        return new OrderDomainServiceImpl();
//    }
//
//
//}
