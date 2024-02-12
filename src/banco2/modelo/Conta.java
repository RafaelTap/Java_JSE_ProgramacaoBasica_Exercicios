package banco2.modelo;

public class Conta {

	Cliente cliente;
	int numero;
	int saldo;

	int contador = 0;

	public Conta(Cliente cliente) {
		contador++;

		this.cliente = cliente;
		this.numero = contador;
		this.saldo = 0;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public String listarDadosConta() {
		return "Informações da conta\n\n Nome: " + cliente.getNome() + "\nConta: " + numero + "\nSaldo: " + saldo;
	}

}
