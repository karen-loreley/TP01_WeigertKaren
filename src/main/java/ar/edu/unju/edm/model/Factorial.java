package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
//crear paquetes

public class Factorial {
	//atributos
	private Integer num1;
	//constructorres
	public Factorial() {
		//todo auto 
	}
	public Factorial(Integer num1) {
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
	
	
	public int resolverFactorial() {
		
		int num=1;
		for(int i=1; i<num1+1; i++) {
			num*=i;
		}
		return num;
	}
	

}
