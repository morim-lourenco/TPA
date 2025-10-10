package atividades;
import java.util.Scanner;
public class CalculoSalario {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		double horaAula, numeroAula, desconto, salarioLiq;
		
		System.out.println("Digite suas horas trabalhadas: ");
		horaAula = ler.nextDouble();
		
		System.out.println("Digite a quantidade das tuas aulas: ");
		numeroAula = ler.nextDouble();
		
		System.out.println("Digite seus desconto: ");
		desconto = ler.nextDouble();
		
		salarioLiq = (horaAula*numeroAula) - desconto;
		
		System.out.println("Seu salario és: " + salarioLiq);
	}

}
