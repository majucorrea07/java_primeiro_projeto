package primeiro_projeto;
import java.util.Scanner;
public class Somativa_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis 
		double horatrab,valorhora,salbruto,salliquido,inss;
		//Instaciar classe Scanner
		Scanner ler = new Scanner (System.in);
		
		//Entrada de dados 
		System.out.println("Infome horatrab: ");
		horatrab = ler.nextDouble();
				
		System.out.println("Informe valorhora: ");
		valorhora = ler.nextDouble();
				
		//Processamento
		salbruto = horatrab*valorhora;
		inss = salbruto*0.12;
		salliquido = salbruto - inss;
		
		//Saída
		System.out.println("O seu salário bruto é de: " + salbruto);
		System.out.println("O valor do inss de: " + inss); 
		System.out.println("O resultado do salliquido é:" + salliquido);
		
		//TODO Auto-generated method stub
		
		
		
		
		
		
		
		
				

	}

}
