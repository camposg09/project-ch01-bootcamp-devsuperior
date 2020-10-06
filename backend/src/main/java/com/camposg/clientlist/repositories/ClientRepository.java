package com.camposg.clientlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.camposg.clientlist.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
