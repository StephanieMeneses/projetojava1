package executavel;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		int nota1 = 7;
		int nota2 = 7;
		int nota3 = 7;
		int nota4 = 7;
	

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Condições lógicas com IF e ELSE */

		/*
		 * if (media >= 7) { System.out.println("Aluno aprovado: " + media); } else if
		 * (media >= 4 && media <= 6) { System.out.println("Aluno em recuperação " +
		 * media); } else { System.out.println("Você foi reprovado: " + media);
		 * 
		 * }/*
		 * 
		 * /* Operadores ternários são para micro validações
		 */

		String saidaResultado;

		/*
		 * saidaResultado = media >= 7 ? "Aluno Aprovado" : (media >= 4 && media <= 6) ?
		 * "Aluno em Recuperação" : "Aluno Reprovado";
		 * 
		 * System.out.println(saidaResultado);*/

		/*if (media < 5) {
			if (media >= 7) {
				if (media > 9) {
					System.out.println("Aluno aprovado direto - Parabéns");
				} else {
					System.out.println("Aluno está aprovado direto " + media );
				}
				System.out.println("Aluno está em recuperação");
			}
		} else {
			System.out.println("Aluno Reprovado Direto " + media);
		} */
		
		/*SWITH CASE: OPERAÇÕES EXATAS*/
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