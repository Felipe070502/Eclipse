package main;

import java.util.Scanner;

import entidade.Atividadeavaliativa;

public class Principal {

	public static void main(String[] args) {
		
		double resultado,resultado2;
		double nota1;
		double nota2;
		double nota3;
		double peso1;
		double peso2;
		double peso3;
		Atividadeavaliativa armazenarDados = new Atividadeavaliativa (); 
		Scanner lerDado = new Scanner (System.in);
		
		
		System.out.println("Digite a primeira nota:");
		nota1 = lerDado.nextDouble();
		armazenarDados.setNotaUm(nota1);
		
		System.out.println("Digite o primeiro peso da nota: ");
		peso1 = lerDado.nextDouble();
		armazenarDados.setPesoUm(peso1);
		
		System.out.println("Digite a segunda nota: ");
		nota2 = lerDado.nextDouble();
		armazenarDados.setNotaDois(nota2);
		
		System.out.println("Digite o segundo peso da nota: ");
		peso2 = lerDado.nextDouble();
		armazenarDados.setPesoDois(peso2);
		
		System.out.println("Digite a terceira nota: ");
		nota3 = lerDado.nextDouble();
		armazenarDados.setNotaTres(nota3);
		
		System.out.println("Digite o terceiro peso da nota: ");
		peso3 = lerDado.nextDouble();
	     armazenarDados.setPesoTres(peso3);
		
		resultado = armazenarDados.calcularMedia(nota1, peso1, nota2, peso2, nota3, peso3);
		resultado2 = armazenarDados.final1(resultado,peso1, peso2, peso3);
		System.out.println("A media final e " + (float)resultado2);
	}
	
}
