package executavel;

public class PrimeiraClasseJava {

	static int maiorIdade = 30;

	public static void main(String[] args) {
	
    int maiorIdade = 18;
    
    int idadeIdoso = 60;
    
    int idadeJovem = 16;
    		
    int idadeCrianca = 7;
    
    String cpf = "082.021.184-39";
    
   System.out.println("Maior idade � = " + maiorIdade);
   System.out.println("Melhor idade � = " + idadeIdoso);
   System.out.println("Jovem idade � = " + idadeJovem);
   System.out.println("Crian�a idade � = " + idadeCrianca);
   System.out.println("O CPF � = " + cpf + " LUCIANO");
   
   metodo2(cpf, idadeIdoso, idadeJovem, idadeCrianca); 
   
	}
	  public static void metodo2(String cpfLuciano, int idadeIdoso, int idadeJovem, int idadeCrianca) {
      System.out.println("Maior idade � = " + maiorIdade);
      System.out.println("O CPF � = " + cpfLuciano + " LUCIANO");

	  }
	  public static void metodo2(String cpfLuciano) {
		  
	  }

}
