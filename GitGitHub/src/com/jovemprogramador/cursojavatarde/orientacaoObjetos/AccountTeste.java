package com.jovemprogramador.cursojavatarde.orientacaoObjetos;

public class AccountTeste {

	public static void main(String[] args) {
		Account conta = new Account(993264-2, 0001,0,"Thayna Dmenjon",false, 1000);
				
		System.out.println(conta.getNumeroConta());
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNomeCliente());
		System.out.println(conta.getLimite());
		
		conta.mostrarStatus();
		conta.ativarConta();
		conta.mostrarStatus();
		System.out.println("O Saldo inicial da conta �: " + conta.getSaldoInicial()+ " realize um deposito");
		conta.depositar();
		System.out.println("O saldo da conta �: " + conta.getSaldo());
		conta.sacar();
		System.out.println("O saldo da conta �: " + conta.getSaldo());
		
		

	}

}
