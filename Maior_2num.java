package pac;

import javax.swing.JOptionPane;

public class Maior_2num {

	public static void main(String[] args) {
		
		String n = JOptionPane.showInputDialog("Digite o primeiro número:");
		int num1 = Integer.parseInt(n);	
				
		n = JOptionPane.showInputDialog("Digite o segundo número:");
		int num2 = Integer.parseInt(n);
		
		JOptionPane.showMessageDialog(null, "O maior é: "+(num1>num2 ?num1:num2));
	}
}