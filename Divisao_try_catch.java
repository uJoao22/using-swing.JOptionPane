package pac;

import javax.swing.JOptionPane;

public class Divisao_try_catch {

	public static void main(String[] args) {

		try {
			
			String n = JOptionPane.showInputDialog("Digite o primeiro n�mero:");
			float num1 = Integer.parseInt(n);	
					
			n = JOptionPane.showInputDialog("Digite o segundo n�mero:");
			float num2 = Integer.parseInt(n);	
			
			try {
				JOptionPane.showMessageDialog(null, "A divis�o desses n�meros � de: "+ num1/num2);
			} catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Erro! Divis�o por 0 negada!");
			}
			
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Inv�lido!!!", "Erro", JOptionPane.ERROR_MESSAGE);
		} 
		
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro!");
		}
		
		finally{
			JOptionPane.showMessageDialog(null, "Fim!!");
		}	
	}
}