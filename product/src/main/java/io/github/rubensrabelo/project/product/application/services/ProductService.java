package io.github.rubensrabelo.project.product.application.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import io.github.rubensrabelo.project.product.application.dtos.ProductCreateDTO;
import io.github.rubensrabelo.project.product.application.dtos.ProductResponseDTO;
import io.github.rubensrabelo.project.product.application.exceptions.ResourceNotFoundException;
import io.github.rubensrabelo.project.product.model.Product;
import io.github.rubensrabelo.project.product.repositories.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ModelMapper modelMapper;

    public ProductService(ProductRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public ProductResponseDTO create(ProductCreateDTO dto) {
        Product entity = modelMapper.map(dto, Product.class);
        entity = repository.save(entity);
        return modelMapper.map(entity, ProductResponseDTO.class);
    }

    public void delete(Long id) {
        int rows = repository.softDelete(id);

        if (rows == 0) {
            throw new ResourceNotFoundException("Product not found");
        }
    }
}
