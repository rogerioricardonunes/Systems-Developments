import java.util.Scanner;


public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String str;
		System.out.println("Informe um número:");
		str = entrada.nextLine();
		
		inteiro(str);
		System.out.println(inteiro(str));
	
	}

	/* metodo inteiro e responsavel por tratar as exceções e retornar inteiro positivo ou negativo.*/
	private static int inteiro(String str){
		int numero = 0, aux = 0;
		String temp;	
	
		try { 
			temp = str.trim(); 
			if(temp.isEmpty()|| temp.equals("null")){
				numero = Integer.parseInt(temp);
			}
			else{
				numero = Integer.parseInt(temp);
			}
		}catch(NumberFormatException e){
			aux = numero = -22; 
		} 
		finally{	 
		}	
		
		return numero;	
		}








}
