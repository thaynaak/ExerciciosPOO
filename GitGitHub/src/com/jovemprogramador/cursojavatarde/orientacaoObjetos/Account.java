package com.jovemprogramador.cursojavatarde.orientacaoObjetos;

import java.util.Scanner;

public class Account {
	private int numeroConta;
	private int agencia;
	private double saldoInicial;
	private String nomeCliente;
	private boolean status;
	private int limite;
	public double saldo;
	public double deposito;
	public double saque;

	Account() {
	}

	Scanner scan = new Scanner(System.in);

	Account(int numeroConta, int agencia, double saldoInicial, String nomeCliente, boolean status, int limite) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldoInicial = saldoInicial;
		this.nomeCliente = nomeCliente;
		this.status = status;
		this.limite = limite;
	}
	public double getSaldoInicial(){
		return this.saldoInicial;
	}
	public int getNumeroConta() {
		return this.numeroConta;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public int getLimite() {
		return this.limite;
	}
	
	public boolean contaAtiva() {
		return this.status;
	}

	public boolean ContaInativa() {
		return this.status;
	}

	void mostrarStatus() {
		if (contaAtiva()) {
			System.out.println("A conta esta ativa");
		} else {
			System.out.println("A conta est� inativa");
		}
	}

	void ativarConta() {
		if (contaAtiva()) {
			this.status = false;

		} else {
			this.status = true;
		}
	}

	double depositar() {
		System.out.println("Digite o valor que deseja depositar");
		deposito = scan.nextDouble();
		saldo += deposito;
		return this.saldo;
	}

	double sacar() {
		System.out.println("Digite o valor que deseja sacar");
		saque = scan.nextDouble();
		saldo -= saque;
		return this.saque;
	}
	public double getSaldo() {
		return this.saldo;
	}
}