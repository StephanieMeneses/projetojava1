package executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/*DOUBLE - numeros decimais*/
		
            double nota1 = 90;
    		double nota2 = 70;
    		double nota3 = 50;
    		double nota4 = 88;
    		
    		double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
    		System.out.println("Media das Notas = " + mediaFinal);
    		
    	/*CHAR representa uma letra ou caractere*/	
    		
    		char pessoaFisica = 'F';
    		char pessoaJuridica = 'J';
    		char pessoaFemina = 'F';
    		
    		if(pessoaFemina == 'F') {
    			System.out.println("Feminina");
    		}
    		else {
    			System.out.println("Femino");
    		}
    		
    	/*STRING no Java sempre será um texto de tamanho qualquer*/
    		
    		String nome = "Stephanie Sousa";
    		String cpf = "787.787.858.85";
    		String telefone = "99685-9854";
    		String endereço ="Jari - Maracanaú/CE";
    	/*Concatenação = Unir ou juntar dados*/	
    		
    		System.out.println("Meu nome é :" + nome + " e o CPF é " + cpf + " " + endereço );
    		
	}
}

