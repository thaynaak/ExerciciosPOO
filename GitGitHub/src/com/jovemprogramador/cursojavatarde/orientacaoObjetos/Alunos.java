package com.jovemprogramador.cursojavatarde.orientacaoObjetos;

public class Alunos {

		private String nome;
		private int matricula;
		private double nota1;
		private double nota2;
		private double nota3;
		private String disciplina1;
		private String disciplina2;
		private String disciplina3;
		public boolean atingiuMedia;
		
		Alunos() {
		}
		
		public Alunos(String nome, int matricula, double nota1, double nota2, double nota3, String disciplina1, String disciplina2, String disciplina3) {
			this.setNome(nome);
			this.matricula = matricula;
			this.nota1 = nota1;
			this.nota2 = nota2;
			this.nota3 = nota3;
			this.disciplina1 = disciplina1;
			this.disciplina2 = disciplina2;
			this.disciplina3 = disciplina3;
			
		}
		public double getNota1() {
			return nota1;
		}
		public double getNota2() {
			return nota2;
		}
		public double getNota3() {
			return nota3;
		}
		public void setNota1(double novaNota1) {
			nota1 = novaNota1;
		}
		public void setNota2(double novaNota2) {
			nota2 = novaNota2;
		}
		public void setNota3(double novaNota3) {
			nota3 = novaNota3;
		}
		public double media(){
			return (nota1 + nota2 + nota3)/3.0;
		}
		public boolean atingiuMedia() {
			if (media() >= 7) {
				atingiuMedia = true;
				System.out.println("Aluno está aprovado!");
			} else {
				System.out.println("Aluno reprovado!");
			}
			return atingiuMedia;
		}
		public String getNome() {
			return nome;
		}
		public int getMatricula() {
			return matricula;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDisciplina1() {
			return disciplina1;
		}
		public String getDisciplina2() {
			return disciplina2;
		}
		public String getDisciplina3() {
			return disciplina3;
		}


	}

