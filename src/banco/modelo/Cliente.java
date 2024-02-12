package banco.modelo;

public class Cliente {

	String nome;
	String cidade;
	String estado;

	public Cliente() {
		
	}
	
	public String listarDadosCliente() {
		return "Nome: " + nome + "\nCidade: " + cidade + "\nEstado: " + estado;
	}

}
