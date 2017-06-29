package torreHanoiProf;

import java.util.Stack;
import javax.naming.ldap.SortControl;

public class TorreHanoi {

	// pilha de comandos que substitui as chamadas recursivas
	private static Stack stack = new Stack();

	// armazena o número no movimento atual
	private static long numMov;

	// Método que realiza (imprime) o movimento
	// de um disco entre dois pinos
	private static void move(int s, int d) {
		numMov++;
		System.out.println("[" + numMov + "]:" + s + " -> " + d);
	}

	// Método iterativo para Torre de Hanoi
	public void executeHanoi(int n, int source, int destination, int aux) {

		// Declararando e empilhando o primeiro comando
		Command currentCommand = new Command(n, source, destination, aux);
		
		stack.push(currentCommand);

		// Execultamos o restante do alg enquanto tivemos
		// comandos na pilha
		while (!stack.empty()) {

			// Empilha um novo comando sempre que n > 1
			if (n > 1) {

				--n;

				// Seria uma chamada recursiva
				currentCommand = new Command(n, source, aux, destination);

				stack.push(currentCommand);
			
			//Desempilha e executa o comando
			} else {
								 //Cast
				currentCommand = (Command) stack.pop();
				
				n = currentCommand.getN();
				
				move(currentCommand.getSource(), currentCommand.getDestination());
			}

		}
	}
}
