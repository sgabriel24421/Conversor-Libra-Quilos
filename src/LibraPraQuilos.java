import java.util.Scanner;
public class LibraPraQuilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double libras = 2.20462;
		double quilos = 0.453592;
		double converted;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira 1 para converter libras em quilos ");
		System.out.println("Insira 2 para converter quilos em libras ");
		double choice = scan.nextDouble();
		
		if (choice== 1) {
			System.out.println("Insira o peso em libras: ");
			libras = scan.nextDouble();
			converted = libras*0.4535;
			System.out.println("O peso em quilos é " + converted);
		}
		
		else if (choice== 2) {
			System.out.println("Insira o peso em quilos: ");
			quilos = scan.nextDouble();
			converted = quilos*2.2046;
			System.out.println("O peso em libras é " + converted);
		}
		
	}

}
