package Construtor;

public class ObjetoCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("BRA2E19");
		Carro carro2 = new Carro(12345);
		Carro carro3 = new Carro(32414,"EOF4Y6Q");
		
		//-----------------------------------------------------------------------------------------------------------------------------------

		Animal animal1 = new Animal(13);
		Animal animal2 = new Animal("Amarelo");
		Animal animal3 = new Animal(22,"Azul");
		
		//-----------------------------------------------------------------------------------------------------------------------------------

		Consulta consulta1 = new Consulta("01/01/2024","Lusca");
		Consulta consulta2 = new Consulta("Sla");
		Consulta consulta3 = new Consulta();
		
		//-----------------------------------------------------------------------------------------------------------------------------------
		
		
		System.out.println("--------Carro---------");
		System.out.println(carro1.getPlaca());
		System.out.println(carro2.getNumChassi());
		System.out.println(carro3.getPlaca());
		System.out.println(carro3.getNumChassi());
		
		System.out.println("--------Animal--------");
		System.out.println(animal1.getTamanho());
		System.out.println(animal2.getCor());
		System.out.println(animal3.getTamanho());
		System.out.println(animal3.getCor());
		
		System.out.println("-------Consulta-------");
		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePcente());
		System.out.println(consulta2.getNomeDents());
		
		System.out.println("----------------------");
		

	}

}
