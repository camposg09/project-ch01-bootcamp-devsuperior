package com.camposg.clientlist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll(); 
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
		
	}
	
}
