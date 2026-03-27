package io.github.rubensrabelo.project.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.github.rubensrabelo.project.client.model.Client;
import jakarta.transaction.Transactional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Client c SET c.isActive = false WHERE c.id = :id")
    int softDelete(Long id);
}
