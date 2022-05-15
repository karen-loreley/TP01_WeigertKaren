package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class BucleFor {
 int bucle;
String aux;	
public BucleFor ()
{
	
}

	public int getBucle() {
	return bucle;
}

public void setBucle(int bucle) {
	this.bucle = bucle;
}

public String buclef()
{
	// Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle for.
	String resultado=" ";
	
	for(int i=320; i>=160; i=i-bucle)
	{
		aux=String.valueOf(i);
	    resultado= resultado + " " + aux;
	}
	return resultado;
}
	
}
