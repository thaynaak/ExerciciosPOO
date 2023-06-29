package com.jovemprogramador.cursojavatarde.orientacaoObjetos;

public class Lampada {

	private String tipoLampada;
	private String cor;
	private String marca;
	private double preco;
	private double potencia;
	public boolean estadoLampada;

	Lampada() {
	}

	public Lampada(String tipoLampada, String cor, String marca, double potencia, double preco) {
		this.tipoLampada = tipoLampada;
		this.cor = cor;
		this.marca = marca;
		this.potencia = potencia;
		this.preco = preco;
		
	}

	boolean ligar() {
		estadoLampada = true;
		return estadoLampada;
	}

	boolean desligar() {
		estadoLampada = false;
		return estadoLampada;
	}

	void mostrarEstado() {
		if (estadoLampada) {
			System.out.println("A lampada est� ligada");
		} else {
			System.out.println("A lampada est� desligada");
		}
	}

	void mudarEstado() {
		if (estadoLampada) {
			estadoLampada = false;

		} else {
			estadoLampada = true;

		}
	}

	public String getTipoLampada() {
		return tipoLampada;
	}

	public String getCor() {
		return cor;
	}
	public String getMarca() {
		return marca;
	}
	public double getPreco() {
		return preco;
	}
		public double getPotencia() {
			return potencia;
		}
}


