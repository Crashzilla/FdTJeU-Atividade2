package Atividade2;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main (String[] args) throws Exception{
		
		Float valor1;
		Float valor2;
		String operador;
		Calculadora resultado = new Calculadora();
		
		try{
			valor1 = new Float (JOptionPane.showInputDialog("Digite o primeiro valor."));
			if (valor1 == 0){
				throw new Exception("Valor n�o pode ser igual a '0'");
			}
			valor2 = new Float (JOptionPane.showInputDialog("Digite o segundo valor."));
			operador = JOptionPane.showInputDialog("Digite o tipo de opera��o que deseja realizar.");
			
			switch (operador){
			case "+":
				System.out.println("Resultado: "+resultado.somar(valor1, valor2));
				break;
			case "-":
				System.out.println("Resultado: "+resultado.subtrair(valor1, valor2));
				break;
			case "/":
				System.out.println("Resultado: "+resultado.dividir(valor1, valor2));
				break;
			case "*":
				System.out.println("Resultado: "+resultado.multiplicar(valor1, valor2));
				break;
			default:
				System.out.println("Operador n�o reconhecido.");
			}
		}
		
		catch (IllegalArgumentException e){
			System.out.println("Valor n�o reconhecido: " + e);
		}
		catch (ArithmeticException e){
			System.out.println("Problema Aritm�tico: " + e);
		}
	}
}
