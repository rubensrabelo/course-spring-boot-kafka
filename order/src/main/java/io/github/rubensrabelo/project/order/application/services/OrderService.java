package io.github.rubensrabelo.project.order.application.services;

import org.springframework.stereotype.Service;

import io.github.rubensrabelo.project.order.repositories.OrderRepository;
import io.github.rubensrabelo.project.order.repositories.OrderedItemRepository;

@Service
public class OrderService {

    private final OrderRepository repository;
    private final OrderedItemRepository orderedItemRepository;  
}
