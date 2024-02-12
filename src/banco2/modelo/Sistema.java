package banco2.modelo;

import javax.swing.JOptionPane;

public class Sistema {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome(JOptionPane.showInputDialog(null, "Digite seu nome"));
		cliente.setCidade(JOptionPane.showInputDialog(null, "Digite sua Cidade"));
		cliente.setEstado(JOptionPane.showInputDialog(null, "Digite seu Estado"));
		
		JOptionPane.showMessageDialog(null, cliente.listarDadosCliente());
		
		Conta conta = new Conta(cliente);
		
		JOptionPane.showMessageDialog(null, conta.listarDadosConta());
		
	}

}
