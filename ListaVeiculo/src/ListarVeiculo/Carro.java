package ListarVeiculo;

public class Carro extends Veiculo {
	   public Carro(String modelo, int ano) {
		   super(modelo, ano, "Carro");
	   }
	   
	   public void ligar() {
		   System.out.println("O carro está ligando.");
	   }
}
