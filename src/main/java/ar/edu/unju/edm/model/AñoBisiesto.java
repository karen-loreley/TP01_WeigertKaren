package ar.edu.unju.edm.model;

//import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class AñoBisiesto {
	private Integer num1;
	
	public AñoBisiesto ()
	{
		
	}
	public AñoBisiesto (Integer num1) {
		super();
		this.num1 = num1;
	}
	//geter y seter7
	public Integer getNum1() {
		return num1;
	}
	public void setNum1(Integer num1) {
		this.num1 = num1;
	}
	
	
	public String resolverBisiesto() {
	/*el año debe ser divisible por 4, pero no divisible por 100, o el año debe ser divisible por 400. Si cumple estas 
condiciones el año es bisiesto.*/
	//String respuest1 = "" , respuesta2 = "";
	//Scanner entrada = new Scanner(System.in);
	
		//System.out.println("ingrese un año: ");
		//num1 =entrada.nextInt();
		
		if ((num1 % 4 == 0) && ((num1 % 100 != 0) || (num1 % 400 == 0)))
	{
			return "el año es bisiesto";
	}
	else
	{
		return "el año no es bisiesto";
	
	}

	}
}
