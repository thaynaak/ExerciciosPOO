package com.jovemprogramador.cursojavatarde.orientacaoObjetos;

import java.util.Scanner;

public class AlunosTeste {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Alunos aluno1 = new Alunos ("Bruno",191817, 6.5, 8.0, 7.5, "Matemática", "Biologia", "Química");
				
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getMatricula());
		System.out.println(aluno1.getNota1());
		System.out.println(aluno1.getNota2());
		System.out.println(aluno1.getNota3());
		System.out.println(aluno1.getDisciplina1());
		System.out.println(aluno1.getDisciplina2());
		System.out.println(aluno1.getDisciplina3());
		System.out.println(aluno1.media());
		
		System.out.println("Digite a nota da recuperação de " + aluno1.getDisciplina1() + ":");
		aluno1.setNota1(scan.nextDouble());
		System.out.println("Digite a nota da recuperação de "+ aluno1.getDisciplina2()+ ":");
		aluno1.setNota2(scan.nextDouble());
		System.out.println("Digite a nota da recuperação de "+ aluno1.getDisciplina3()+ ":");
		aluno1.setNota3(scan.nextDouble());
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getNota1());
		System.out.println(aluno1.getNota2());
		System.out.println(aluno1.getNota3());
		System.out.println(aluno1.media());
		aluno1.atingiuMedia();
		
Alunos aluno2 = new Alunos ("Alice",131415, 5.5, 6.0, 7.5, "Português", "Ingles", "Física");
		
		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getMatricula());
		System.out.println(aluno2.getNota1());
		System.out.println(aluno2.getNota2());
		System.out.println(aluno2.getNota3());
		System.out.println(aluno2.getDisciplina1());
		System.out.println(aluno2.getDisciplina2());
		System.out.println(aluno2.getDisciplina3());
		System.out.println(aluno2.media());
		
		System.out.println("Digite a nota da recuperação de " + aluno2.getDisciplina1() + ":");
		aluno2.setNota1(scan.nextDouble());
		System.out.println("Digite a nota da recuperação de "+ aluno2.getDisciplina2()+ ":");
		aluno2.setNota2(scan.nextDouble());
		System.out.println("Digite a nota da recuperação de "+ aluno2.getDisciplina3()+ ":");
		aluno2.setNota3(scan.nextDouble());
		
		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getNota1());
		System.out.println(aluno2.getNota2());
		System.out.println(aluno2.getNota3());
		System.out.println(aluno2.media());
		aluno2.atingiuMedia();
		
Alunos aluno3 = new Alunos ("João",282930, 7.0, 7.5, 4.5, "História", "Geografia", "Matemática");
		
		System.out.println(aluno3.getNome());
		System.out.println(aluno3.getMatricula());
		System.out.println(aluno3.getNota1());
		System.out.println(aluno3.getNota2());
		System.out.println(aluno3.getNota3());
		System.out.println(aluno3.getDisciplina1());
		System.out.println(aluno3.getDisciplina2());
		System.out.println(aluno3.getDisciplina3());
		System.out.println(aluno3.media());
		
		System.out.println("Digite a nota da recuperação de " + aluno3.getDisciplina1() + ":");
		aluno3.setNota1(scan.nextDouble());
		System.out.println("Digite a nota da recuperação de "+ aluno3.getDisciplina2()+ ":");
		aluno3.setNota2(scan.nextDouble());
		System.out.println("Digite a nota da recuperação de "+ aluno3.getDisciplina3()+ ":");
		aluno3.setNota3(scan.nextDouble());
		
		System.out.println(aluno3.getNome());
		System.out.println(aluno3.getNota1());
		System.out.println(aluno3.getNota2());
		System.out.println(aluno3.getNota3());
		System.out.println(aluno3.media());
		aluno3.atingiuMedia();
		
scan.close();	}

}
