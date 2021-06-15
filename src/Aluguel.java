import java.util.Scanner;

public class Aluguel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quartos[] quarto = new Quartos[10];
		System.out.println("Digite a quantidade de estudantes que farão aluguel: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite seu nome: ");
			String nomeDoAluno = sc.nextLine();
			System.out.println("Digite seu e-mail: ");
			String emailDoAluno = sc.nextLine();
			System.out.println("Digite o número do quarto: ");
			int numeroDoQuarto = sc.nextInt();
			quarto[numeroDoQuarto]= new Quartos(nomeDoAluno, emailDoAluno);
		}
		
		for(int i=0; i<quarto.length; i++) {
			if(quarto[i]!=null) {
				System.out.println("\nNome do Aluno: "+ quarto[i].getNomeDoAluno());
				System.out.println("E-mail do Aluno: "+ quarto[i].getEmailDoAluno());
				System.out.println("Quarto: "+ i);
			}
		
		}
	sc.close();
	}
}
