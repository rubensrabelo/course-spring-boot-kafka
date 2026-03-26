package io.github.rubensrabelo.project.product.application.dtos;

import java.math.BigDecimal;

public class ProductCreateDTO {

    private String name;
    private BigDecimal unitValue;
    private Boolean active;

    public ProductCreateDTO() {
    }

    public ProductCreateDTO(String name, BigDecimal unitValue, Boolean active) {
        this.name = name;
        this.unitValue = unitValue;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(BigDecimal unitValue) {
        this.unitValue = unitValue;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
