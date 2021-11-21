import java.util.Vector;

/**
 * Clase Stack declara e inicializa dos variables junto a varios métodos.
 * @author Cristina
 * @version 1.0
 */

public class Stack {
	/**
	 * Declara una variables int para el tamaño
	 * y un vector donde almacena los elementos
	 */
	private int tamaño;
	private Vector<Integer> elementos;

	/**
	 * Constructor vacio.
	 * Inicializa el vector de elementos y el tamaño.
	 */
	public Stack() {
		
		elementos = new Vector<Integer>();
		tamaño = 0;
	}

	/**
	 * Método que commprueba si el Stack esta vacio
	 * @return true si esta vacio, si no false.
	 */
	public boolean stackVacio () {
		if (tamaño==0) {
			return true;
		}
		return false;
	}

	/**
	 * Método que añade el parametro o al vector elementos en la posición tamaño del vector e incrementa la variable tamaño en 1.
	 * @param o (Integer)
	 */
	public void apilar ( Integer o ) {
		elementos.add(tamaño, o);
		tamaño++;
	}
	
	/**
	 * Método que devuelve el penúltimo elemento o null si el Stack está vacio.
	 * @return el valor del penúltimo elemento, siempre que el Stack no este vacio.
	 */
	public Integer desapilar () {
		try {
			if(stackVacio())
				throw new ErrorStackVacio();
			else {
				return elementos.get(--tamaño);
			}
		} catch(ErrorStackVacio error) {
			System.out.println("ERROR: el stack está vacio");
			return null;
		}
	}

	/**
	 * Método que devuelve el tamaño del Stack
	 * @return el tamaño del Stack 
	 */
	public int getNumElements() {
		return tamaño;
	}

	/**
	 * Llama a una excepción personalizada que recoge todo tipo de errores.
	 */

	@SuppressWarnings("serial")
	class ErrorStackVacio extends Exception {
		public ErrorStackVacio() {
			super();
		}
	}


}
