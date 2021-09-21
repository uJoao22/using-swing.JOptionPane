package pac;

import javax.swing.JOptionPane;

public class Par_Impar {

	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Digite um número:");
		int num = Integer.parseInt(s);	
		
		if(num%2 == 0) {
			JOptionPane.showMessageDialog(null, "O número é par");
		} else {
			JOptionPane.showMessageDialog(null, "O número é impar");
		}
	}
}