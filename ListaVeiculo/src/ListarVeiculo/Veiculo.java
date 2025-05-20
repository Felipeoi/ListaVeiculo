package ListarVeiculo;

public class Veiculo {
     private String modelo;
     private int ano;
     private String tipo;
 
     
     public Veiculo(String modelo, int ano, String tipo) {
		 this.modelo = modelo;
		 this.ano = ano;
		 this.tipo = tipo;
		 
	
	 }
 
	 public String getModelo() {
		 return modelo;
	 }
 
	 public void setModelo(String modelo) {
		 this.modelo = modelo;
	 }
 
	 public int getAno() {
		 return ano;
	 }
 
	 public void setAno(int ano) {
		 this.ano = ano;
	 }
 
	 public String getTipo() {
		 return tipo;
	 }
 
	 public void setTipo(String tipo) {
		 this.tipo = tipo;
	 }
 
	 public void exibirInformacoes() {
		 System.out.println("Modelo: " + modelo);
		 System.out.println("Ano: " + ano);
		 System.out.println("Tipo: " + tipo);
		 System.out.println("-------------------------");
	 }
	 
	 public void ligar() {
		 System.out.println("Veículo ligado.");
	 }
	 
	 public void desligar() {
		 System.out.println("Veículo desligado.");
	 }
	 
	 public void acelerar() {
		 System.out.println("Veículo acelerando.");
	 }
	
}
