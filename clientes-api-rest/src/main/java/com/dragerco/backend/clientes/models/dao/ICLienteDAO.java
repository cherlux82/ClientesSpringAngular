package com.dragerco.backend.clientes.models.dao;

import com.dragerco.backend.clientes.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICLienteDAO extends CrudRepository<Cliente,Long> {



}
