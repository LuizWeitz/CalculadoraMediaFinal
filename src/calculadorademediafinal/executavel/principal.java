package calculadorademediafinal.executavel;

import javax.swing.JOptionPane;

public class principal {

	/* Main é um método auto executavel do java */

	public static void main(String[] args) {

		/* Strings com as perguntas das notas */

		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota, por favor!");
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota, por favor!");
		String nota3 = JOptionPane.showInputDialog("Informe a terceira nota, por favor!");
		String nota4 = JOptionPane.showInputDialog("Informe a quarta nota, por favor!");

		/*
		 * Converte as strings recebidas em números, como é nota, usa DOUBLE por causa de número quebrado
		 */

		double nota01 = Double.parseDouble(nota1);
		double nota02 = Double.parseDouble(nota2);
		double nota03 = Double.parseDouble(nota3);
		double nota04 = Double.parseDouble(nota4);

		/*
		 * Essa linha é responsável pela operação matemática. Soma as notas e divide por 4
		 */

		double notaFinal = (nota01 + nota02 + nota03 + nota04) / 4;

		/*
		 * Essa linha é responsável pela pergunta se é para realmente continuar a operação
		 */

		int resposta = JOptionPane.showConfirmDialog(null, "Você deseja realmente fazer essa divisão?");

		/*
		 * Esse IF ele confere se a RESPOSTA for igual a 0,  continua, se não a operação não é realizada
		 * 0 no JOptionPane é SIM 
		 * Caso a opção selecionada seja NÃO a operação não é realizada
		 */

		if (resposta == 0) {

			/*
			 * Confere se a nota é maior (ou igual) a 50, se for o aluno cai na condição abaixo, se não o aluno está reprovado
			 */

			if (notaFinal >= 50) {

				/*
				 * Confere se a nota é maior(ou igual) a 70, se for o aluno está aprovado, se não está em recupeção
				 */

				if (notaFinal >= 70) {

					
				JOptionPane.showMessageDialog(null, "A Média Final é : " + notaFinal + " Aluno Aprovado!");
				
				} else {
					
				JOptionPane.showMessageDialog(null, "A Média Final é : " + notaFinal + " Aluno Em Recuperação!");
				}
				
			} else {
				
				JOptionPane.showMessageDialog(null, "A Média Final é : " + notaFinal + " Aluno Reprovado");
			}

		} else {

			   JOptionPane.showMessageDialog(null, "Operação não realizada");

		}

	}
}
