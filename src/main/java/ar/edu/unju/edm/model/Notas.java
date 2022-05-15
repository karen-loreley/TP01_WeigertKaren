package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Notas {
 private int nota;

	
	public Notas ()
	{
		
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	

	public String resolvernotas()
	{
		if(nota>6 && nota<=10)
		{
			return "alumno promociona";
		}
		else
		if(nota ==6)
		{
			return "alumno regulariza";
		}
		else
			
		if(nota<6 && nota>=0)
		{
			return "alumno desaprueba";
		}
		  else
	     return "valor no permitido";  
		
	}
	}