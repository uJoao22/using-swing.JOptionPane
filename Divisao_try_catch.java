package pac;

import javax.swing.JOptionPane;

public class Divisao_try_catch {

	public static void main(String[] args) {

		try {
			
			String n = JOptionPane.showInputDialog("Digite o primeiro número:");
			float num1 = Integer.parseInt(n);	
					
			n = JOptionPane.showInputDialog("Digite o segundo número:");
			float num2 = Integer.parseInt(n);	
			
			try {
				JOptionPane.showMessageDialog(null, "A divisão desses números é de: "+ num1/num2);
			} catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Erro! Divisão por 0 negada!");
			}
			
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Inválido!!!", "Erro", JOptionPane.ERROR_MESSAGE);
		} 
		
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro!");
		}
		
		finally{
			JOptionPane.showMessageDialog(null, "Fim!!");
		}	
	}
}