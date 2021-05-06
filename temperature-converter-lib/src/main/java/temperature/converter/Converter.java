package temperature.converter;

import br.com.softblue.commons.io.Console;

public class Converter {

	public static void main(String[] args) {

		System.out.print("Digite a temperatura:");
		double temp = Console.readDouble();

		System.out.println("Qual a conversao? ( 1 = F -> C , 2 = C -> F):");
		int opcao = Console.readInt();

		double r;
		
		if (opcao == 1) {
		r = convertToCelsius(temp);
		} else if (opcao == 2) {
		r = convertToFahrenheit(temp);
		}else {
			System.out.println("Opcao invalida");
			return;
		}

		System.out.println("A temperatura convertida e: " + r);
	}

	static double convertToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) / 1.8;
		return celsius;
	}

	static double convertToFahrenheit(double celsius) {
		double fahrenheit = celsius * 1.8 + 32;
		return fahrenheit;

	}

}
