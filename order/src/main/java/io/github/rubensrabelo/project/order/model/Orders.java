package io.github.rubensrabelo.project.order.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Sort.Order;

import io.github.rubensrabelo.project.order.infra.client.representation.CustomerRepresentation;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

    private Long id;
    private Long idClient;
    private LocalDateTime orderDate;
    private BigDecimal total;
    private String paymentKey;
    private String observations;
    private String status;
    private String trackingCode;
    private String urlInvoice;
    private PaymentDetails paymentDetails;

    private List<OrderedItem> items;
    private CustomerRepresentation customerRepresentation;
}
