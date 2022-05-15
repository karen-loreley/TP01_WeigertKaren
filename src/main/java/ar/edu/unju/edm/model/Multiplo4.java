package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Multiplo4 {

int cuatro;
String aux;
	


	public int getCuatro() {
		return cuatro;
	}

	public void setCuatro(int cuatro) {
		this.cuatro = cuatro;
	}
	public String multiplo4()
	{/*Utilizando la estructura de control iterativa do-while, genere la secuencia numérica, la cual está 
determinada por los números múltiplos de 4 menores o iguales que 100:
4 8 12 16 20 24 28 32 36 40 44 48 52 56 60 64 68 72 76 80 84 88 92 96 100*/
		
		//int i=1;
		String resultado=" ";//si se empieza en 0
		
		//int i=cuatro;
		
		do
		{
			//=cuatro+i;
			cuatro=cuatro+4;//0=0+4
			aux=String.valueOf(cuatro);//cambia el valor a string y asigna el valor de cuatro en aux
			
			resultado=resultado+" "+aux;// = +aux
					
		}while(cuatro<100);
		return resultado;
		}
	
	}
