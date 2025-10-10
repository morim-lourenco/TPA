package atividades;

import java.util.Scanner;

public class Pesqueiro {
public static void main(String args[]) {
	Scanner ler = new Scanner(System.in);
	double precoPeixe,pesoPeixe;
	
	System.out.println("Digite o peso do peixe: ");
	pesoPeixe = ler.nextDouble();
	
	if (pesoPeixe == 3) {
		precoPeixe = 25.00;
	} else if(pesoPeixe > 3 && pesoPeixe <= 5) {
		precoPeixe = 24.00;
	} else if(pesoPeixe > 5 && pesoPeixe <=10) {
		precoPeixe = 23.00;
	} else {
		precoPeixe = 50.00;
	}
	
	System.out.println("O preço do peixe é: " + precoPeixe);

	ler.close();
	}
}