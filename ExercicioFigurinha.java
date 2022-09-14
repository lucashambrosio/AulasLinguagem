import java.util.Scanner;
public class ExercicioFigurinha {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		String nome = null, selecao = null;
		int idade;
		String nome [] = new  [5];
		
		for (int i =0 ; i < 5 ; i++) {
			
		
		System.out.println("Informa o nome do jogador da Figurinha: ");
		nome = ler.next();
		
		System.out.println("Informa a idade do jogador da Figurinha: ");
		idade = ler.nextInt();
		
		System.out.println("Informa a seleção do jogador da Figurinha: ");
		selecao = ler.next();
		
		
		
		
		}
		
		if (nome == "Marquinhos" ) {
			
			System.out.println("Marquinhos vai levantar a taça do Hexa! ");
			
		}else if (nome == "Hulk") {
			System.out.println("Dessa vez não vai dar para você!");
			
			
		}else if (selecao == "Argentina") {
			
			System.out.println("Adeus los hermanos!!!");
		}
		
		
		

	}

}
