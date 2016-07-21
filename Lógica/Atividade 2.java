	public class AvaliaPrecedencia {

		public static void main(String[] args) {
			 
			operacao();
		}
	
		public static void operacao(){
			
			 int numero = 5;          //numero passa a valer 5
			 numero = (numero + 8) ;  //numero passa a valer 13
			 numero = (numero - numero); //numero passa a valer zero
			 System.out.println(" Numero passa a valer: " + numero +"\n");
			 
			 String x = "Alo";        	 // x é inicializado com a string "Alo"
			 String y = "Mundo!";        // y é inicializado com a string "Mundo!"
			 x = (x + ", " + y);
			 System.out.println(" O x passa a valer: " + x);// x passa a valer "Alo, Mundo!"
		}
    }