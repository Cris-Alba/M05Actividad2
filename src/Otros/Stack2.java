package Otros;

import java.util.Vector;
/**
 * Clase creada para usar un protocolo lifo
 * @author Martí Curto Vendrell
 * @version 1.0
 *
 */
public class Stack2 {

	/**
	 * La clase esta compuesta de 2 atributos, un int que indica el tamaño del Stack 
	 * y un vector con el los elementos que vamos añadiendo
	 */
	private int tamaño;
	private Vector<Integer> elementos;

	/**
	 * Contructor de la clase.
	 * Se inicializa un vector sin elementos
	 * y un tamaño inicial de 0.
	 */
	public Stack2() {		
		elementos = new Vector<Integer>();
		tamaño = 0;
	}

	/**
	 * Comprueba si el Stack esta vacio
	 * @return true si el Stack no tiene elementos almacenados
	 */
	public boolean stackVacio () {
		if (tamaño==0 && elementos.size()==0) {
			return true;
		}
		return false;
	}

	/**
	 * Añade en Integer que recive como parametro al Stack
	 * @param o integer que queramos añadir al Stack
	 */
	public void apilar ( Integer o ) {
		elementos.add(tamaño, o);
		tamaño++;
	}

	/**
	 * Quita el ultimo elemento del Stack y reduce el atributo tamaño
	 * @return tamaño del Stack despues de quitar el ultimo elemento
	 */
	public Integer desapilar () {
		try {
			if(stackVacio())
				throw new ErrorStackVacio();
			else {
				elementos.remove(--tamaño);
				return tamaño;
			}
		} catch(ErrorStackVacio error) {
			System.out.println("ERROR: el stack está vacio");
			return null;
		}
	}

	/**
	 * Indica el numero de elementos en el Stack
	 * @return tamaño actual del Stack
	 */
	public int getNumElements() {
		return tamaño;
	}

	/**
	 * Inner class creada para lanzar excepción personalizada
	 * @author Martí Curto Vendrell
	 */
	@SuppressWarnings("serial")
	class ErrorStackVacio extends Exception {
		public ErrorStackVacio() {
			super();
		}
	}
}
