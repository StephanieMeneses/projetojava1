package executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		int nota1 = 7;
		int nota2 = 7;
		int nota3 = 7;
		int nota4 = 7;
	

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Condi��es l�gicas com IF e ELSE */

		/*
		 * if (media >= 7) { System.out.println("Aluno aprovado: " + media); } else if
		 * (media >= 4 && media <= 6) { System.out.println("Aluno em recupera��o " +
		 * media); } else { System.out.println("Voc� foi reprovado: " + media);
		 * 
		 * }/*
		 * 
		 * /* Operadores tern�rios s�o para micro valida��es
		 */

		String saidaResultado;

		/*
		 * saidaResultado = media >= 7 ? "Aluno Aprovado" : (media >= 4 && media <= 6) ?
		 * "Aluno em Recupera��o" : "Aluno Reprovado";
		 * 
		 * System.out.println(saidaResultado);*/

		/*if (media < 5) {
			if (media >= 7) {
				if (media > 9) {
					System.out.println("Aluno aprovado direto - Parab�ns");
				} else {
					System.out.println("Aluno est� aprovado direto " + media );
				}
				System.out.println("Aluno est� em recupera��o");
			}
		} else {
			System.out.println("Aluno Reprovado Direto " + media);
		} */
		
		/*SWITH CASE: OPERA��ES EXATAS*/
		int dia = 2;  
		switch (dia) {
		case 1: 
			System.out.println("domingo");
			
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break; 

		default: System.out.println("outro dia qualquer ");
			break;
		}
	}
}