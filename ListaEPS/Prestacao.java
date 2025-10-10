package atividades;
import java.util.Scanner;
public class Prestacao {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double valor, tempo, taxa, prestacao;
		
		System.out.println("Digite o valor: ");
		valor = ler.nextDouble();
		
		System.out.println("Digite o tempo: ");
		tempo = ler.nextDouble();
		
		taxa = 15;
		prestacao = valor + (valor * (taxa/100)*tempo);
		System.out.println("Sua prestação é: " + prestacao);
	}
}