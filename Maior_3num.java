package pac;

import javax.swing.JOptionPane;

public class Maior_3num {

	public static void main(String[] args) {
		
		String n = JOptionPane.showInputDialog("Digite o primeiro n�mero:");
		int num1 = Integer.parseInt(n);	
				
		n = JOptionPane.showInputDialog("Digite o segundo n�mero:");
		int num2 = Integer.parseInt(n);
		
		n = JOptionPane.showInputDialog("Digite o segundo n�mero:");
		int num3 = Integer.parseInt(n);
		
		JOptionPane.showMessageDialog(null,"O maior �: " +Math.max(num1, Math.max(num2, num3)));
	}
}