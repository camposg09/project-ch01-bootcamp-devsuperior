package com.camposg.clientlist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camposg.clientlist.dto.ClientDTO;
import com.camposg.clientlist.entities.Client;
import com.camposg.clientlist.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ClientDTO> findAllPaged(PageRequest pageRequest) {
		Page<Client> list = repository.findAll(pageRequest); 
		return list.map(x -> new ClientDTO(x));
		
	}

	
}
