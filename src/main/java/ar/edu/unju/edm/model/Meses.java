package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Meses {
private int mes;
	
	public Meses ()
	{
		
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public String resolvermes()
	{
		/*Solicite al usuario de forma repetitiva que ingrese un número de tipo entero y verifique si 
corresponde a algún mes del año. Si el número no corresponde a ningún mes, muestre un 
mensaje “no existe ese mes” y finaliza el ingreso de datos. Utilice la estructura de control de 
selección use la estructura de control if.*/
		
		if(mes > 0 && mes<=12 )
		{
			return "pertenece a un mes";
			/*switch(mes)
			{
			case 1: return "enero";
			case 2: return "febrero";
			case 3: return "marzo";
			case 4: return "abril";
			case 5: return "mayo";
			case 6: return "junio";
			case 7: return "julio";
			case 8: return "agosto";
			case 9: return "septiembre";
			case 10: return "octubre";
			case 11: return "noviembre";
			case 12: return "diciembre";
				
			}*/
		}
		else
			return "No existe ese mes";
	}
}
