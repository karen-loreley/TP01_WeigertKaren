package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

/*realiza el cálculo del tiempo que tarda en caer un objeto desde una altura h. Aplicar la siguiente formula:*/

@Component
public class Tiempo {
	int h;
	public Tiempo ()
	{
		
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}

	public double tiempo()
	{
		double g=9.81;
		double clave = ((2*h)/g);
			double raiz	= Math.pow(clave, (double)1/2);
		
		return raiz;
	}
	
}
