package dado;

import java.util.Random;

import javax.swing.JOptionPane;

public class Jogada {
	
	public static void main(String[] args) {
		
		
		/* • Dentro desse método main(), você deverá exibir ao usuário, usando um JOptionPane, um
		número sorteado aleatoriamente de 1 a 6 (incluindo estes), como se tivéssemos um dado de
		seis lados.
		*/
		
		Random dado = new Random();
		
		JOptionPane.showMessageDialog(null, dado.nextInt(1, 6));
				
	}

}
