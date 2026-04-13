package io.github.rubensrabelo.project.order.infra.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.rubensrabelo.project.order.infra.client.representation.ProductRepresentation;

@FeignClient(name = "products", url = "${ipurchases.orders.clients.products.url}")
public interface ProductClient {
    @GetMapping("{id}") // Criar esse endpoint no ms Product
    ResponseEntity<ProductRepresentation> findById(@PathVariable("id") Long id);
}
