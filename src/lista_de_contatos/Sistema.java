package lista_de_contatos;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Sistema {

	public static void main(String[] args) {

		List<Contato> listaContatos = new ArrayList<Contato>();
		String mensagem;

		JOptionPane.showMessageDialog(null, "Adicionar novo contato");

		do {
			Contato contato = new Contato();
			contato.setNome(JOptionPane.showInputDialog(null, "Digite o nome"));
			contato.setEmail(JOptionPane.showInputDialog(null, "Digite o e-mail"));
			contato.setTelefone(JOptionPane.showInputDialog(null, "Digite o telefone"));

			listaContatos.add(contato);

			mensagem = JOptionPane.showInputDialog(null, "Novo contato, aperte qualquer tecla e para sair digite 0");

		} while (!mensagem.equals("0"));
		if (mensagem.equals("0")) {
			for (Contato contatos : listaContatos) {
				JOptionPane.showMessageDialog(null, "lista de contatos\n\n" + contatos);
			}
		}

	}
}
