import java.util.Vector;

/**
 * Clase Stack declara e inicializa dos variables junto a varios m�todos.
 * @author Cristina
 * @version 1.0
 */

public class Stack {
	/**
	 * Declara una variables int para el tama�o
	 * y un vector donde almacena los elementos
	 */
	private int tama�o;
	private Vector<Integer> elementos;

	/**
	 * Constructor vacio.
	 * Inicializa el vector de elementos y el tama�o.
	 */
	public Stack() {
		
		elementos = new Vector<Integer>();
		tama�o = 0;
	}

	/**
	 * M�todo que commprueba si el Stack esta vacio
	 * @return true si esta vacio, si no false.
	 */
	public boolean stackVacio () {
		if (tama�o==0) {
			return true;
		}
		return false;
	}

	/**
	 * M�todo que a�ade el parametro o al vector elementos en la posici�n tama�o del vector e incrementa la variable tama�o en 1.
	 * @param o (Integer)
	 */
	public void apilar ( Integer o ) {
		elementos.add(tama�o, o);
		tama�o++;
	}
	
	/**
	 * M�todo que devuelve el pen�ltimo elemento o null si el Stack est� vacio.
	 * @return el valor del pen�ltimo elemento, siempre que el Stack no este vacio.
	 */
	public Integer desapilar () {
		try {
			if(stackVacio())
				throw new ErrorStackVacio();
			else {
				return elementos.get(--tama�o);
			}
		} catch(ErrorStackVacio error) {
			System.out.println("ERROR: el stack est� vacio");
			return null;
		}
	}

	/**
	 * M�todo que devuelve el tama�o del Stack
	 * @return el tama�o del Stack 
	 */
	public int getNumElements() {
		return tama�o;
	}

	/**
	 * Llama a una excepci�n personalizada que recoge todo tipo de errores.
	 */

	@SuppressWarnings("serial")
	class ErrorStackVacio extends Exception {
		public ErrorStackVacio() {
			super();
		}
	}


}
