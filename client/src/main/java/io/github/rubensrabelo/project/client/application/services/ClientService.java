package io.github.rubensrabelo.project.client.application.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import io.github.rubensrabelo.project.client.application.dtos.ClientCreateDTO;
import io.github.rubensrabelo.project.client.application.dtos.ClientResponseDTO;
import io.github.rubensrabelo.project.client.application.exceptions.ResourceNotFoundException;
import io.github.rubensrabelo.project.client.model.Client;
import io.github.rubensrabelo.project.client.repositories.ClientRepository;

@Service
public class ClientService {

    private final ClientRepository repository;
    private final ModelMapper modelMapper;

    public ClientService(ClientRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public ClientResponseDTO findById(Long id) {
        Client entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Client not found"));

        return modelMapper.map(entity, ClientResponseDTO.class);
    }

    public ClientResponseDTO create(ClientCreateDTO dto) {
        Client entity = modelMapper.map(dto, Client.class);
        entity = repository.save(entity);
        return modelMapper.map(entity, ClientResponseDTO.class);
    }

    public void delete(Long id) {
        int row = repository.softDelete(id);

        if (row == 0)
            throw new ResourceNotFoundException("Client not found");
    }
}
