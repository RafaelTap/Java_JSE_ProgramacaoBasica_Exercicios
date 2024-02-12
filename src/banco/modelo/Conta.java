package banco.modelo;

public class Conta {

	Cliente cliente;
	int numero;
	double saldo;
	
	int contador;

	public Conta(Cliente cliente) {
		
		contador ++;
		this.cliente = cliente;
		this.numero = contador;
		this.saldo = 0;
	}

	public String listarDadosConta() {
		return "Nome: " + cliente + "\nConta: " + numero + "\nSaldo: " + saldo;

	}

}
