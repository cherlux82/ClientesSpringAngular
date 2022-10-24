package com.dragerco.backend.clientes.models.service;

import com.dragerco.backend.clientes.models.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IClienteService {

     List<Cliente> findAll();

     Cliente findById(Long id);

     Cliente save(Cliente cliente);

     void delete(Long id );

}
