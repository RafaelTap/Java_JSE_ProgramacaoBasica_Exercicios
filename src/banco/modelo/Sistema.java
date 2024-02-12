package banco.modelo;

import javax.swing.JOptionPane;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(); 
		
		cliente.nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		cliente.cidade = JOptionPane.showInputDialog(null, "Digite sua cidade: ");
		cliente.estado = JOptionPane.showInputDialog(null, "Digite seu estado: ");
		
		JOptionPane.showMessageDialog(null, "Informações do cliente\n" + cliente.listarDadosCliente());
		
		Conta conta = new Conta(cliente);
		
		JOptionPane.showMessageDialog(null, "Informações da conta\n" + conta.listarDadosConta());
		
		
	}

}
