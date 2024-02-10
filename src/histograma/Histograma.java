package histograma;

import java.util.Random;

import javax.swing.JOptionPane;

public class Histograma {

	/*
	 * Um histograma (também chamado de diagrama de frequências) é um gráfico usado
	 * para visualizar a quantidade de ocorrências de um conjunto de dados agrupado
	 * em classes.
	 * 
	 * >>>>> Vamos criar um aplicativo que mostre um “histograma em modo texto”,
	 * exibindo quantas vezes números de 1 a 10 foram sorteados dentro de 100
	 * sorteios possíveis.
	 * 
	 * 1 - > Você precisará repetir 100 vezes o sorteio de um número de 1 a 10 e
	 * guardar quantas vezes cada um foi sorteado. Por exemplo, se o primeiro
	 * sorteio retornar 5, o contador de sorteios para 5 passará de 0 para 1. Se o
	 * segundo obtiver 2, o contador para 2 subirá de 0 para 1. Caso o terceiro
	 * retorne novamente 5, incrementa-se mais uma vez o contador para 5, que ficará
	 * agora com 2. E assim por diante.
	 * 
	 * 2 -> Prefira usar um vetor a variáveis individuais.
	 * 
	 * 3 - > Após realizar o sorteio, crie uma string que mostrará a quantidade de
	 * ocorrências para cada número de 1 a 10. Ao invés de mostrar a quantidade de
	 * vezes que cada um foi sorteado, imprima uma quantidade de cerquilhas (#)
	 * equivalente. No exemplo da figura a seguir, o número 1 foi sorteado 13 vezes;
	 * já o número 4, apenas quatro vezes.
	 */

	public static void main(String[] args) {

		Random random = new Random();
		int conjunto[] = new int[10];
		StringBuilder sB = new StringBuilder();

		for (int i = 0; i < 100; i++) {
			conjunto[random.nextInt(10)]++;

		}

		sB.append("HISTOGRAMA");
		for (int i = 0; i < 10; i++) {
			sB.append("\nNúmero " + (i+1) + ": ");
			for (int j = 1; j < conjunto[i]; j++) {
				sB.append("#");
			}
		}

		JOptionPane.showMessageDialog(null, sB);

	}

}
