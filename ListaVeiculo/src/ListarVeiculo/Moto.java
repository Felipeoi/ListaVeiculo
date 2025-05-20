package ListarVeiculo;

public class Moto extends Veiculo{
	 public Moto(String modelo, int ano) {
		 super(modelo, ano, "Moto");
	 }
	 
	 public void ligar() {
		 System.out.println("A moto está ligando.");
	 }


}
