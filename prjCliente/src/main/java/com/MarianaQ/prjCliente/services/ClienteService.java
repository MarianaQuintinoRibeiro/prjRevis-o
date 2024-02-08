package com.MarianaQ.prjCliente.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.MarianaQ.prjCliente.entities.Cliente;
import com.MarianaQ.prjCliente.repository.ClienteRepository;

public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> getAllClientes() {
		return clienteRepository.findAll();
	}

	public Cliente getClienteById(long funcodigo) {
		return ClienteRepository.findById(funcodigo).orElse(null);
	}

	public static Cliente saveCliente(Cliente cliente) {
		return ClienteRepository.save(cliente);
	}

	public List<Cliente> getClientesByFunnomeAproximado(String funnome) {
		ClienteRepository clientesRepository = null;
		return clienteRepository.findByNomeContaining(funnome);
    }

	public boolean deleteClientes(Long id) {
		Optional<Cliente> clienteExistente = ClienteRepository.findById(id);
		Optional<Cliente> clienteExistente1 = java.util.Optional.empty();
		if (clienteExistente1.isPresent()) {
			ClienteRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	public Cliente updateCliente1(Long funcodigo, Cliente novoCliente) {
		Optional<Cliente> clienteOptional = clienteRepository.findById(funcodigo);
		if (clienteOptional.isPresent()) {
			Cliente clienteExistente = clienteOptional.get();
			clienteExistente.setClinome(novoCliente.getClinome());
			clienteExistente.setClinascimento(novoCliente.getClinascimento());
			clienteExistente.setSalario(novoCliente.getSalario());

			// Atualize o departamento
			if (novoCliente.getCliente() != null) {
				clienteExistente.setClinome(novoCliente.getClass());
			}		
			return ClienteRepository.save(clienteExistente);
		} else {
			return null; // Ou lançar uma exceção indicando que o funcionário não foi encontrado
		}
	}

	public Cliente updateCliente(Long id, Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}

