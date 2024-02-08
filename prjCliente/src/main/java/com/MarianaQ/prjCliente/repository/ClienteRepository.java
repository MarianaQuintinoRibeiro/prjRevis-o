package com.MarianaQ.prjCliente.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.MarianaQ.prjCliente.entities.Cliente;
import com.MarianaQ.prjCliente.entities.Pedido;

public abstract class ClienteRepository {

	@Query("SELECT f FROM Funcionario f WHERE LOWER(f.funnome) LIKE LOWER(CONCAT('%', :funnome, '%'))")
	public abstract
	List<Cliente> findByNomeContaining(@Param("funnome") String funnome);

	public static Cliente save(Cliente clienteExistente) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public static Optional<Cliente> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	}


