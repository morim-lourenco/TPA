package atividades;

public class Tabuada10 {
public static void main(String[] args) {
	int i,expo,resultado;
	
	for (i=1;i<=10;i++) {
		System.out.println("A " +i+ " tabuada: ");
		for (expo=1; expo<=10; expo = expo + 1) {
			resultado = i * expo;
			System.out.println(i+ "x" +expo+ " = " +resultado);
		}
		
	}
}
}
