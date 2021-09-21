package pac;

import javax.swing.JOptionPane;

public class Soma_num {

	public static void main(String[] args) {
	
		String n = JOptionPane.showInputDialog("Digite o primeiro número:");
		int num1 = Integer.parseInt(n);	
				
		n = JOptionPane.showInputDialog("Digite o segundo número:");
		int num2 = Integer.parseInt(n);	
		
		JOptionPane.showMessageDialog(null, "A soma desses números é de: "+ (num1+num2));
	}
}