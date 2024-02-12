package banco2.modelo;

public class Cliente {

	String nome;
	String cidade;
	String estado;

	public Cliente() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String listarDadosCliente() {
		return "Informações do Cliente\n\nNome: " + nome + "\nCidade: " + cidade + "\nEstado: " + estado;
	}
}
