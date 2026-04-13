package io.github.rubensrabelo.project.order.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import io.github.rubensrabelo.project.order.infra.client.representation.CustomerRepresentation;
import io.github.rubensrabelo.project.order.model.enums.OrderStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long idClient;

    @Column(nullable = false)
    private LocalDateTime orderDate;
    
    @Column(precision = 16, scale = 2)
    private BigDecimal total;
    
    private String paymentKey;
    private String observations;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private String trackingCode;
    private String urlInvoice;

    @Transient
    private PaymentDetails paymentDetails;

    @OneToMany(mappedBy = "order")
    private List<OrderedItem> items = new ArrayList<>();

    @Transient
    private CustomerRepresentation customerRepresentation;

    public Order() {
    }

    public Order(Long idClient, LocalDateTime orderDate, BigDecimal total, String paymentKey, String observations,
            OrderStatus status, String trackingCode, String urlInvoice, PaymentDetails paymentDetails) {
        this.idClient = idClient;
        this.orderDate = orderDate;
        this.total = total;
        this.paymentKey = paymentKey;
        this.observations = observations;
        this.status = status;
        this.trackingCode = trackingCode;
        this.urlInvoice = urlInvoice;
        this.paymentDetails = paymentDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getPaymentKey() {
        return paymentKey;
    }

    public void setPaymentKey(String paymentKey) {
        this.paymentKey = paymentKey;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public String getUrlInvoice() {
        return urlInvoice;
    }

    public void setUrlInvoice(String urlInvoice) {
        this.urlInvoice = urlInvoice;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public List<OrderedItem> getItems() {
        return items;
    }

    public void setItems(List<OrderedItem> items) {
        this.items = items;
    }

    public CustomerRepresentation getCustomerRepresentation() {
        return customerRepresentation;
    }

    public void setCustomerRepresentation(CustomerRepresentation customerRepresentation) {
        this.customerRepresentation = customerRepresentation;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
