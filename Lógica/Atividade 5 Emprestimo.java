
public class Emprestimo {

	public static void main(String[] args) {

		double capitalInicial = 10000.00;
		double taxaJuro = 0.03;
		int meses = 3;
		double montante = obtenhaMontante(capitalInicial, taxaJuro, meses);
		double juroTotal = obtenhaJuroTotal(capitalInicial, montante);
		

	    System.out.printf("O montante a ser pago é:  %f\n", montante);
	    System.out.printf("O total de juros a ser pago é: %f\n", juroTotal);
	    System.exit(0);
	}
	
	//metodo atende a atividade 5.1 obtendo total montante
	public static double obtenhaMontante(double capitalInicial, double taxaJuro, int meses){
		double montante = capitalInicial * Math.pow((1 + taxaJuro), meses);
		
		return montante;
	}
	
	//metodo atende a atividade 5.3 obtendo total Juros
	public static double obtenhaJuroTotal(double capitalInicial, double montante){
		double juroTotal = montante - capitalInicial;
		
		return juroTotal;
	}
}
