package Otros;

import java.util.Vector;
/**
 * Clase creada para usar un protocolo lifo
 * @author Mart� Curto Vendrell
 * @version 1.0
 *
 */
public class Stack2 {

	/**
	 * La clase esta compuesta de 2 atributos, un int que indica el tama�o del Stack 
	 * y un vector con el los elementos que vamos a�adiendo
	 */
	private int tama�o;
	private Vector<Integer> elementos;

	/**
	 * Contructor de la clase.
	 * Se inicializa un vector sin elementos
	 * y un tama�o inicial de 0.
	 */
	public Stack2() {		
		elementos = new Vector<Integer>();
		tama�o = 0;
	}

	/**
	 * Comprueba si el Stack esta vacio
	 * @return true si el Stack no tiene elementos almacenados
	 */
	public boolean stackVacio () {
		if (tama�o==0 && elementos.size()==0) {
			return true;
		}
		return false;
	}

	/**
	 * A�ade en Integer que recive como parametro al Stack
	 * @param o integer que queramos a�adir al Stack
	 */
	public void apilar ( Integer o ) {
		elementos.add(tama�o, o);
		tama�o++;
	}

	/**
	 * Quita el ultimo elemento del Stack y reduce el atributo tama�o
	 * @return tama�o del Stack despues de quitar el ultimo elemento
	 */
	public Integer desapilar () {
		try {
			if(stackVacio())
				throw new ErrorStackVacio();
			else {
				elementos.remove(--tama�o);
				return tama�o;
			}
		} catch(ErrorStackVacio error) {
			System.out.println("ERROR: el stack est� vacio");
			return null;
		}
	}

	/**
	 * Indica el numero de elementos en el Stack
	 * @return tama�o actual del Stack
	 */
	public int getNumElements() {
		return tama�o;
	}

	/**
	 * Inner class creada para lanzar excepci�n personalizada
	 * @author Mart� Curto Vendrell
	 */
	@SuppressWarnings("serial")
	class ErrorStackVacio extends Exception {
		public ErrorStackVacio() {
			super();
		}
	}
}
