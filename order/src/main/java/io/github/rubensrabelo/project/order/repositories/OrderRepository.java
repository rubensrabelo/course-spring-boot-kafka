package io.github.rubensrabelo.project.order.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import io.github.rubensrabelo.project.order.model.Order;

@Repository
public interface OrderRepository {
    Optional<Order> findByIdAndPaymentKey(Long id, String paymentKey);
}
