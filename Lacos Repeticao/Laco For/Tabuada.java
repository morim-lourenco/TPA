package atividades;

import java.util.Scanner;

public class Tabuada {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int i,resultado,numero;
	
	System.out.println("Digite um numero para tabuada: ");
	numero = ler.nextInt();
	for (i=1; i<=10; i++) {
		resultado = i * numero;
		System.out.println(i+ "x" +numero+ "= " +resultado);
	}
}
}
