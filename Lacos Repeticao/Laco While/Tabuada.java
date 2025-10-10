package atividades;

import java.util.Scanner;
public class Tabuada {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int i=1,numero,resultado;
	
	System.out.println("Digite o numero que quer saber a tabuada: ");
	numero = ler.nextInt();
	
	while(i<=10) {
		resultado = numero * i;
		System.out.println("O " +i+ " Numero: " +resultado);
		i = i+1;
	}
}
}
