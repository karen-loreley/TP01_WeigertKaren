package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class BlucleWhile {
	int bucle;
	String aux;
	public BlucleWhile ()
	{
		
	}
	public int getBucle() {
		return bucle;
	}
	public void setBucle(int bucle) {
		this.bucle = bucle;
	}
	
	public String buclew()
	{
		// Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.
		String resultado=" ";
		int i=320;
		while ( i>=160)
		{
			aux=String.valueOf(i);
		    resultado= resultado + " " + aux;
		    i=i-bucle;
		}
		return resultado;
	}
	
}
