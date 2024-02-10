package adivinhe_o_numero;

import java.util.Random;

import javax.swing.JOptionPane;

public class Adivinhe_ {

	/*
	 * Neste exercício, vamos elaborar um “mini-jogo” de adivinhação. • Sorteie um
	 * número de 1 a 50 (inclusive). • Solicite ao usuário que tente adivinhar qual
	 * é esse número. • Se o palpite for superior ao número sorteado, informe-o de
	 * que o número é inferior ao que ele forneceu. Caso seja inferior, avise-o de
	 * que o número correto é superior. • Quando ele acertar o valor, mostre quantas
	 * tentativas fez até aquele ponto e encerre o programa. • Permita que o usuário
	 * desista de acertar ao fornecer o número 0 como palpite.
	 */

	public static void main(String[] args) {

		int numeroSorteado;
		int numeroEscolhido = 0;
		int tentativas = 0;

		Random aleatorio = new Random();
		numeroSorteado = aleatorio.nextInt(1, 50);

		JOptionPane.showMessageDialog(null, "Escolha um número entre 1 e 50, inclusive, caso desista digite 0");

		do {
			String numeroString = JOptionPane.showInputDialog(null, "Digite o número");
			try {
				numeroEscolhido = Integer.parseInt(numeroString);
				if (numeroEscolhido > 0) {
					if (numeroEscolhido > numeroSorteado) {
						JOptionPane.showMessageDialog(null, " O número sorteado é menor");
					} else if (numeroEscolhido < numeroSorteado) {
						JOptionPane.showMessageDialog(null, " O número sorteado é maior");
					}
					tentativas++;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite apenas números inteiros.");
			}

		} while (numeroEscolhido != 0 && numeroEscolhido != numeroSorteado);

		String resultado = numeroEscolhido == numeroSorteado ? "Acertou após " + tentativas + " tentativas!"
				: "Você desistiu =(";

		JOptionPane.showMessageDialog(null, resultado);

	}

}
