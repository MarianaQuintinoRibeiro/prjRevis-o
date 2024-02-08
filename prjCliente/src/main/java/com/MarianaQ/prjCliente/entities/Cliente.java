package com.MarianaQ.prjCliente.entities;

import jakarta.persistence.ManyToOne;

public class Cliente {

	@ManyToOne
	private Cliente cliente;

//inserir os metodos get e o set
public Cliente getClienteo() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Object getClinome() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setClinome(Object clinome) {
		// TODO Auto-generated method stub
		
	}

	public Object getClinascimento() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setClinascimento(Object clinascimento) {
		// TODO Auto-generated method stub
		
	}

	public Object getSalario() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSalario(Object salario) {
		// TODO Auto-generated method stub
		
	}

	public Object getCliente() {
		// TODO Auto-generated method stub
		return null;
	}
}
