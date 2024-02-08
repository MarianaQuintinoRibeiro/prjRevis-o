package com.MarianaQ.prjCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.MarianaQ.prjCliente.entities.Pedido;
import com.MarianaQ.prjCliente.services.PedidoService;


public class PedidoController {

private PedidoService pedidoService;
	
	@GetMapping("/home")
    public String paginaInicial() {
        return "index"; // Nome do seu arquivo HTML (sem a extensão)
    }

	public void PedidoCrontroller(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pedido> getPedido(@PathVariable Long id) {
		Pedido pedido = pedidoService.getPedidoById(id);
		if (pedido != null) {
			return ResponseEntity.ok(pedido);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@PostMapping
	public Pedido createPedido(@RequestBody Pedido pedido) {
		return pedidoService.savePedido(pedido);
	}

	@GetMapping
	public ResponseEntity<List<Pedido>> getAllPedido(RequestEntity<Void> requestEntity) {
		String method = requestEntity.getMethod().name();
		String contentType = requestEntity.getHeaders().getContentType().toString();
		List<Pedido> pedido = pedidoService.getAllPedidos();
		return ResponseEntity.status(HttpStatus.OK).header("Method", method).header("Content-Type", contentType)
				.body(pedido);
	}

	@DeleteMapping("/{id}")
	public void deletePedido(@PathVariable Long id) {
		PedidoService.savePedido(id);
	}

	@PutMapping("/{id}")
	public Pedido updatePedido(@PathVariable Long id, @RequestBody Pedido pedido) {
		return pedidoService.updatePedido(id, pedido);
	}
}

