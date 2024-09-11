package Construtor;

public class Carro {
	private String placa;
	private int numChassi;

	//-----------------------------------------------------------------------------------------------------------------------------------

	
	public Carro(String placa) {
		this.placa = placa;
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	
	public Carro(int numChassi) {
		this.numChassi = numChassi;
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	
	public Carro(int numChassi, String placa) {
		this.placa = placa;
		this.numChassi = numChassi;
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getNumChassi() {
		return numChassi;
	}
	
	public void setNumChassi(int numChassi) {
		this.numChassi = numChassi;
	}
}
	
	//-----------------------------------------------------------------------------------------------------------------------------------