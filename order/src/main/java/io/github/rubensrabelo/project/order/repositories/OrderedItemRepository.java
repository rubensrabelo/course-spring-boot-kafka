package io.github.rubensrabelo.project.order.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.github.rubensrabelo.project.order.model.Order;
import io.github.rubensrabelo.project.order.model.OrderedItem;

@Repository
public interface OrderedItemRepository {
    List<OrderedItem> findByOrder(Order order);
}
