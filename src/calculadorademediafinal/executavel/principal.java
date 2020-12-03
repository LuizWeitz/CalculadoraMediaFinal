package calculadorademediafinal.executavel;

import javax.swing.JOptionPane;

public class principal {

	/* Main � um m�todo auto executavel do java */

	public static void main(String[] args) {

		/* Strings com as perguntas das notas */

		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota, por favor!");
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota, por favor!");
		String nota3 = JOptionPane.showInputDialog("Informe a terceira nota, por favor!");
		String nota4 = JOptionPane.showInputDialog("Informe a quarta nota, por favor!");

		/*
		 * Converte as strings recebidas em n�meros, como � nota, usa DOUBLE por causa de n�mero quebrado
		 */

		double nota01 = Double.parseDouble(nota1);
		double nota02 = Double.parseDouble(nota2);
		double nota03 = Double.parseDouble(nota3);
		double nota04 = Double.parseDouble(nota4);

		/*
		 * Essa linha � respons�vel pela opera��o matem�tica. Soma as notas e divide por 4
		 */

		double notaFinal = (nota01 + nota02 + nota03 + nota04) / 4;

		/*
		 * Essa linha � respons�vel pela pergunta se � para realmente continuar a opera��o
		 */

		int resposta = JOptionPane.showConfirmDialog(null, "Voc� deseja realmente fazer essa divis�o?");

		/*
		 * Esse IF ele confere se a RESPOSTA for igual a 0,  continua, se n�o a opera��o n�o � realizada
		 * 0 no JOptionPane � SIM 
		 * Caso a op��o selecionada seja N�O a opera��o n�o � realizada
		 */

		if (resposta == 0) {

			/*
			 * Confere se a nota � maior (ou igual) a 50, se for o aluno cai na condi��o abaixo, se n�o o aluno est� reprovado
			 */

			if (notaFinal >= 50) {

				/*
				 * Confere se a nota � maior(ou igual) a 70, se for o aluno est� aprovado, se n�o est� em recupe��o
				 */

				if (notaFinal >= 70) {

					
				JOptionPane.showMessageDialog(null, "A M�dia Final � : " + notaFinal + " Aluno Aprovado!");
				
				} else {
					
				JOptionPane.showMessageDialog(null, "A M�dia Final � : " + notaFinal + " Aluno Em Recupera��o!");
				}
				
			} else {
				
				JOptionPane.showMessageDialog(null, "A M�dia Final � : " + notaFinal + " Aluno Reprovado");
			}

		} else {

			   JOptionPane.showMessageDialog(null, "Opera��o n�o realizada");

		}

	}
}
