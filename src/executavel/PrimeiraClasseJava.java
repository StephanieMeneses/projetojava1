package executavel;

public class PrimeiraClasseJava {

	static int maiorIdade = 30;

	public static void main(String[] args) {
	
    int maiorIdade = 18;
    
    int idadeIdoso = 60;
    
    int idadeJovem = 16;
    		
    int idadeCrianca = 7;
    
    String cpf = "082.021.184-39";
    
   System.out.println("Maior idade é = " + maiorIdade);
   System.out.println("Melhor idade é = " + idadeIdoso);
   System.out.println("Jovem idade é = " + idadeJovem);
   System.out.println("Criança idade é = " + idadeCrianca);
   System.out.println("O CPF É = " + cpf + " LUCIANO");
   
   metodo2(cpf, idadeIdoso, idadeJovem, idadeCrianca); 
   
	}
	  public static void metodo2(String cpfLuciano, int idadeIdoso, int idadeJovem, int idadeCrianca) {
      System.out.println("Maior idade é = " + maiorIdade);
      System.out.println("O CPF É = " + cpfLuciano + " LUCIANO");

	  }
	  public static void metodo2(String cpfLuciano) {
		  
	  }

}
