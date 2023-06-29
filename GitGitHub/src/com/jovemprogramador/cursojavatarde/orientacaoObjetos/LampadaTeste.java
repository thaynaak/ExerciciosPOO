package com.jovemprogramador.cursojavatarde.orientacaoObjetos;

import java.util.Scanner;

public class LampadaTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
Lampada lampada1 = new Lampada("Led", "Branca", "Phillips", 4.5, 9.99);

System.out.println(lampada1.getTipoLampada());
System.out.println(lampada1.getCor());
System.out.println(lampada1.getMarca());
System.out.println(lampada1.getPotencia() + "w");
System.out.println(lampada1.getPreco());

		lampada1.mostrarEstado();
		lampada1.mudarEstado();
		lampada1.mostrarEstado();
		lampada1.desligar();
		lampada1.mostrarEstado();
	scan.close();}

}