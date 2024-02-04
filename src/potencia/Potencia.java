package potencia;

import javax.swing.JOptionPane;

public class Potencia {

	/*
	 * Crie um projeto no Eclipse chamado Potencia, com um pacote chamado potencia
	 * (em letras minúsculas) e uma classe também denominada Potencia, com um método
	 * main(). • Dentro de método main(), solicite, usando um JOptionPane por vez,
	 * uma base e um expoente. Armazene-os como tipo double. • Caso o usuário
	 * forneça uma base ou um expoente inválidos, dê uma mensagem informando o fato
	 * e dizendo que o programa será fechado. • Se a base e o expoente forem
	 * válidos, calcule a potência usando os valores passados.
	 */
	public static void main(String[] args) {

		try {
			String valorBase = JOptionPane.showInputDialog(null, "Digite a base: ");
			double base = Double.parseDouble(valorBase);

			String valorExpoente = JOptionPane.showInputDialog(null, "Digite o expoente: ");
			double expoente = Double.parseDouble(valorExpoente);

			double resultado = Math.pow(expoente, base); // (potencia/base)

			JOptionPane.showMessageDialog(null, base + " elevado a " + expoente + " é igual a " + resultado);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"entrada inválida: digite um número, se tiver casa decimal utilize o ponto (.)");
		}

	}

}
