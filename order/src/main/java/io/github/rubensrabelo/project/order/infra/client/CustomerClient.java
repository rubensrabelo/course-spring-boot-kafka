package io.github.rubensrabelo.project.order.infra.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.rubensrabelo.project.order.infra.client.representation.CustomerRepresentation;

@FeignClient(name = "products", url = "${ipurchases.orders.clients.clients.url}")
public interface CustomerClient {
    @GetMapping("{id}") // Criar esse endpoint no ms Client
    ResponseEntity<CustomerRepresentation> findById(@PathVariable("id") Long id);
}
