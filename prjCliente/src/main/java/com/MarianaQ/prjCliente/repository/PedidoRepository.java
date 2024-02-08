package com.MarianaQ.prjCliente.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.MarianaQ.prjCliente.entities.Cliente;
import com.MarianaQ.prjCliente.entities.Pedido;

public abstract class PedidoRepository {

	@Query("SELECT f FROM Funcionario f WHERE LOWER(f.funnome) LIKE LOWER(CONCAT('%', :funnome, '%'))")
	public abstract
	List<Pedido> findByNomeContaining(@Param("funnome") String funnome);

	public Optional<Pedido> findById(Long funcodigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Pedido save(Pedido pedidoExistente) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public List<Pedido> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
