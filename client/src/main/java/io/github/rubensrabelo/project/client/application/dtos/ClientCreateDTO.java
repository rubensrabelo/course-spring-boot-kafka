package io.github.rubensrabelo.project.client.application.dtos;

public class ClientCreateDTO {

    private String name;
    private String cpf;
    private String street;
    private String number;
    private String neighborhood;
    private String email;
    private String phone;
    private Boolean isActive;

    public ClientCreateDTO() {
    }

    public ClientCreateDTO(String name, String cpf, String street, String number, String neighborhood,
            String email, String phone, Boolean isActive) {
        this.name = name;
        this.cpf = cpf;
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.email = email;
        this.phone = phone;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
