package io.github.rubensrabelo.project.order.infra.client.representation;

import java.math.BigDecimal;

public record ProductRepresentation(
    Long id,
    String name,
    BigDecimal unitValue,
    Boolean isActive    
) {
}
