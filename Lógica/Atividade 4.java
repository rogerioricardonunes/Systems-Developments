import javax.swing.JOptionPane;

public class MathUtils {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de A:"));		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de B:"));
		
		double media = average(a, b);
		JOptionPane.showMessageDialog(null, String.format("A média é: %s", media));
	}
	
	/*metodo esta fazendo o calculo da media e retornando a media*/
	public static double average(int a, int b){
		double media = 0;
		
		media = (a + b) / 2; 
		
		return media;
	}
}