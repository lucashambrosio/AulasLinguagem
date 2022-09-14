import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		 Scanner ler = new Scanner(System.in);
	        String fraseUsuario = "";
	        int cnt = 0, qntVogais = 0;
	        System.out.println("Insira a frase para ser analisada: ");
	        fraseUsuario = ler.nextLine();
	        if(fraseUsuario.contains("a") || fraseUsuario.contains("A"))
	            qntVogais++;
	        if(fraseUsuario.contains("e") || fraseUsuario.contains("E"))
	            qntVogais++;
	        if(fraseUsuario.contains("i") || fraseUsuario.contains("I"))
	            qntVogais++;
	        if(fraseUsuario.contains("o") || fraseUsuario.contains("O"))
	            qntVogais++;
	        if(fraseUsuario.contains("u") || fraseUsuario.contains("U"))
	            qntVogais++;

	        System.out.println("A frase possui " + qntVogais + " vogais.");
	    }

       

	}


