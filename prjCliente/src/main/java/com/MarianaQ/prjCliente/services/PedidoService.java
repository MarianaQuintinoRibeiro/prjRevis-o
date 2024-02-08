package com.MarianaQ.prjCliente.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.MarianaQ.prjCliente.entities.Pedido;
import com.MarianaQ.prjCliente.repository.PedidoRepository;

public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	public List<Pedido> getAllPedidos() {
		return pedidoRepository.findAll();
	}

	public Pedido getPedidoById(long funcodigo) {
		return pedidoRepository.findById(funcodigo).orElse(null);
	}

	public Pedido savePedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}

	public List<Pedido> getPedidosByFunnomeAproximado(String funnome) {
        PedidoRepository pedidosRepository = null;
		return pedidosRepository.findByNomeContaining(funnome);
    }

	public boolean deletePedidos(Long id) {
		Optional<Pedido> funcionarioExistente = pedidoRepository.findById(id);
		Optional<Pedido> pedidoExistente = java.util.Optional.empty();
		if (pedidoExistente.isPresent()) {
			pedidoRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	public Pedido updatePedido(Long funcodigo, Pedido novoPedido) {
		Optional<Pedido> pedidoOptional = pedidoRepository.findById(funcodigo);
		if (pedidoOptional.isPresent()) {
			Pedido pedidoExistente = pedidoOptional.get();
			pedidoExistente.setPednome(novoPedido.getPednome());
			pedidoExistente.setPednascimento(novoPedido.getPednascimento());
			pedidoExistente.setSalario(novoPedido.getSalario());

			// Atualize o departamento
			if (novoPedido.getPedido() != null) {
				pedidoExistente.setPednome(novoPedido.getClass());
			}		
			return pedidoRepository.save(pedidoExistente);
		} else {
			return null; // Ou lançar uma exceção indicando que o funcionário não foi encontrado
		}
	}

	public static void savePedido(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	}

