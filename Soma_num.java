package pac;

import javax.swing.JOptionPane;

public class Soma_num {

	public static void main(String[] args) {
	
		String n = JOptionPane.showInputDialog("Digite o primeiro n�mero:");
		int num1 = Integer.parseInt(n);	
				
		n = JOptionPane.showInputDialog("Digite o segundo n�mero:");
		int num2 = Integer.parseInt(n);	
		
		JOptionPane.showMessageDialog(null, "A soma desses n�meros � de: "+ (num1+num2));
	}
}