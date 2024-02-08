package com.MarianaQ.prjCliente.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.MarianaQ.prjCliente.entities.Cliente;
import com.MarianaQ.prjCliente.services.ClienteService;

public class ClienteController {

private ClienteService clienteService;
	
	@GetMapping("/home")
    public String paginaInicial() {
        return "index"; // Nome do seu arquivo HTML (sem a extensão)
    }

	public void ClienteCrontroller(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getCliente(@PathVariable Long id) {
		Cliente cliente = clienteService.getClienteById(id);
		if (cliente != null) {
			return ResponseEntity.ok(cliente);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}

	@GetMapping
	public ResponseEntity<List<Cliente>> getAllCliente(RequestEntity<Void> requestEntity) {
		String method = requestEntity.getMethod().name();
		String contentType = requestEntity.getHeaders().getContentType().toString();
		List<Cliente> cliente = clienteService.getAllClientes();
		return ResponseEntity.status(HttpStatus.OK).header("Method", method).header("Content-Type", contentType)
				.body(cliente);
	}

	@DeleteMapping("/{id}")
	public void deleteCliente(@PathVariable Cliente id) {
		ClienteService.saveCliente(id);
	}

	@PutMapping("/{id}")
	public Cliente updateCliete(@PathVariable Long id, @RequestBody Cliente cliente) {
		return clienteService.updateCliente(id, cliente);
	}
}
