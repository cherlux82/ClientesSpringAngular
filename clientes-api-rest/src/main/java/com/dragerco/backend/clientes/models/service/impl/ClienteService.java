package com.dragerco.backend.clientes.models.service.impl;

import com.dragerco.backend.clientes.models.dao.ICLienteDAO;
import com.dragerco.backend.clientes.models.entity.Cliente;
import com.dragerco.backend.clientes.models.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ClienteService implements IClienteService {

    @Autowired
    private ICLienteDAO clienteDAO;

    @Override
    @Transactional( readOnly=true)
    public List<Cliente> findAll() {
        return (List<Cliente>)clienteDAO.findAll();
    }

    @Override
    @Transactional( readOnly=true)
    public Cliente findById(Long id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        clienteDAO.deleteById(id);
    }
}
