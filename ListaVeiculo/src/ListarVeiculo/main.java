package ListarVeiculo;
import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) {
		
		Veiculo veiculo1 = new Veiculo("Generico", 2022, "Desconhecido");
		Veiculo veiculo2 = new Veiculo("Fusca", 1970, "Carro");
		Veiculo veiculo3 = new Veiculo("Civic", 2020, "Carro");
		Veiculo veiculo4 = new Veiculo("CB500", 2018, "Moto");
		
		
		
		ArrayList<Veiculo> listarVeiculos = new ArrayList<Veiculo>();
		listarVeiculos.add(veiculo1);
		listarVeiculos.add(veiculo2);
		listarVeiculos.add(veiculo3);
		listarVeiculos.add(veiculo4);
	
		for (Veiculo veiculo : listarVeiculos) {
			veiculo.ligar();
			veiculo.exibirInformacoes();
			
		
		}
		
	    
	    

}
}


