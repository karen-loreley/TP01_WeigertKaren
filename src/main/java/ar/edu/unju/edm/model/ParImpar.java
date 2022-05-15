package ar.edu.unju.edm.model;


//import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class ParImpar {
private int num1;
	
	public ParImpar ()
	{
		
	}

	public int getNum1() {
		return num1;
	}
	public void setNu1(int num1) {
		this.num1 = num1;
	}
	
	
	public String resolverparoimpar() {
	/*si un numero es par, el resto de la división de dicho número entre 2 tiene que dar cero.*/
	
		 //Scanner lectura = new Scanner(System.in);
		 /*  int i=1;
			while(i<=5)
			{*/
				 if (num1 % 2 == 0)
					{
					return "el numero es par";
						
					}
					else
					{
				return "el numero es impar";
			      }
				 
				/* i=i+1;
		
	       }*/
}
}
