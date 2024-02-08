package com.MarianaQ.prjCliente.entities;

import jakarta.persistence.ManyToOne;

public class Pedido {

	@ManyToOne
	private Pedido pedido;

//inserir os metodos get e o set
public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Object getPednome() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPednome(Object pednome) {
		// TODO Auto-generated method stub
		
	}

	public Object getPednascimento() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPednascimento(Object pednascimento) {
		// TODO Auto-generated method stub
		
	}

	public Object getSalario() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSalario(Object salario) {
		// TODO Auto-generated method stub
		
	}
}
