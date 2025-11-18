package atividades;
import java.util.Scanner;
public class NumeroInt {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int numero1;
		
		System.out.println("Digite um numero: ");
		numero1 = ler.nextInt();
		if(numero1>0) {
			System.out.println("Número positivo");
		}
		else if(numero1==0) {
			System.out.println("Número neutro");
		} else {
		
				System.out.println("Número negativo");
		}
		ler.close();
	}
	

}
