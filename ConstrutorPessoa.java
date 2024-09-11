package Construtor;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		
		Pessoa jogador1 = new Pessoa();
		Pessoa jogador2 = new Pessoa("Messi",36);
		Pessoa jogador3 = new Pessoa("Fulaninho");
		Pessoa jogador4 = new Pessoa(10);
		
		System.out.println(jogador2.getNome());
		System.out.println(jogador2.getIdade());
		
		System.out.println(jogador3.getNome());
		
		System.out.println(jogador4.getIdade());
	}

}
