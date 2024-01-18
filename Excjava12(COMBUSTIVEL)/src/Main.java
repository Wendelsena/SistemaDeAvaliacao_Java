import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Gasolina = 0;
		int Alcool = 0;
		int Diesel = 0;
		
		System.out.println("Qual sua preferência?\n"
				+ "Gasolina (DIGITE 1)\n"
				+ "Alcool (DIGITE 2)\n"
				+ "Diesel (DIGITE 3)\n");
		
		int Codigo = sc.nextInt();
		
		while (Codigo < 4 && Codigo > 0) {
			
			if (Codigo == 1) {
				Gasolina++;
			}
			else if (Codigo == 2) {
				Alcool++;
			}
			else {
				Diesel++;
			}
		
		Codigo = sc.nextInt();
		
		}
		
		System.out.println("O Resultado foi:");
		System.out.println("\nGasolina: " + Gasolina + "\nAlcool: " + Alcool + "\nDiesel: " + Diesel);

		System.out.println("\nMuito Obrigado!");
		
		
		sc.close();
	}
}