package lista_de_contatos;

public class Contato {

	String nome;
	String telefone;
	String email;

	public Contato() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Contato\n\nnome: " + nome + "\ntelefone: " + telefone + "\ne-mail: " + email;
	}

}
