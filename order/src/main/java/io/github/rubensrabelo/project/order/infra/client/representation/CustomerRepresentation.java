package io.github.rubensrabelo.project.order.infra.client.representation;

public record CustomerRepresentation(
    Long id,
    String name,
    String cpf,
    String street,
    String number,
    String neighborhood,
    String email,
    String phone,
    Boolean isActive
) {
}
