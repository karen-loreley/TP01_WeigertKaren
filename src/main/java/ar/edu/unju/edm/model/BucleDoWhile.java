package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class BucleDoWhile {

	int bucle;
	String aux;
	public BucleDoWhile ()
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
		// Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle do while.
		String resultado=" ";
		int i=320;
		do 
		{
			aux=String.valueOf(i);
		    resultado= resultado + " " + aux;
		    i=i-bucle;
		}while(i>=160);
		return resultado;
	}
}
