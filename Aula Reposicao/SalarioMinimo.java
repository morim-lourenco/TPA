package aulaRepo;
import java.util.Scanner;
public class SalarioMinimo {
public static void main(String args[]) {
	Scanner ler = new Scanner(System.in);
	double salario, salarioMin, diferenca;
	
	System.out.println("Digite o seu salario: ");
	salario = ler.nextDouble();
	salarioMin = 1500;
	
	if (salario > salarioMin) {
		diferenca = salario - salarioMin;
		System.out.println("Você recebe esse valor a mais: " + diferenca);
	} else if (salario < salarioMin) {
		diferenca = salarioMin - salario;
		System.out.println("Você recebe esse valor a menos: " + diferenca);
	} else {
		System.out.println("Você recebe o mesmo valor de um salario minimo");
	}
	ler.close();
}
}
