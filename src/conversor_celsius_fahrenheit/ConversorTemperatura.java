package conversor_celsius_fahrenheit;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public static void main(String[] args) {

		try {
			String valorCelsius = JOptionPane.showInputDialog(null, "Digite a temperatura em graus celsius:");
			double celsius = Double.parseDouble(valorCelsius);

			double fahrenheit = ((celsius * 9) / 5) + 32;

			JOptionPane.showMessageDialog(null, celsius + "° C " + " = " + fahrenheit + "° F");

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"entrada inválida: digite um número, se tiver casa decimal utilize o ponto (.)");
		}
	}

}
