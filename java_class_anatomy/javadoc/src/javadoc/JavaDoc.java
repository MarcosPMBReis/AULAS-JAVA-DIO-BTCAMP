package javadoc;

public class JavaDoc {
	public static void main(String[] args) {
		
		/**
		* <h1>Calculadora</h1>
		* A Calculadora realiza operações matemáticas entre números inteiros
		* <p>
		* <b>Note:</b> Leia atentamente a documentação desta classes
		* para desfrutar dos recursos oferecidos pelo autor
		*
		* @author  Gleyson Sampaio
		* @version 1.0
		* @since   01/01/2022
		*/
		public class Calculadora {
		    /**
		   * Este método é utilizado para somar dois números inteiros
		   * @param numeroUm este é o primeiro parâmetro do método
		   * @param numeroDois este é o segundo parâmetro do método
		   * @return int o resultado deste método é a soma dos dois números.
		   */
		    public int somar(int numeroUm, int numeroDois) {
		        return  numeroUm + numeroDois;
		    }
		}

		
		// Olá, eu sou um comentário em uma única linha
		
		/* Olá,
		 * Eu sou um comentario
		 * que posso ser mais detalhadod
		 * quando necessário
		 */
		
		/** 
		 * Estas duas estrelinhas acima
		 * é para identificar que você
		 * pretende elaborar um comentário
		 * a nível de documentação.
		 * Que incrível !!!
		 */
		
	}
}
