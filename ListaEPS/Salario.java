
public class Salario {
	public static void main(String args[]) {
		double salario, valeTransp, inss, salarioLiq;
		
		salario = 1500.00;
		inss = salario*8/100;
		valeTransp = salario*6/100;
		salarioLiq = salario-(inss+valeTransp);
		System.out.println("Teu salario: " + salarioLiq);
	}
}
