package ar.edu.unju.edm;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.AñoBisiesto;
import ar.edu.unju.edm.model.BlucleWhile;
import ar.edu.unju.edm.model.BucleDoWhile;
import ar.edu.unju.edm.model.BucleFor;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.Meses;
import ar.edu.unju.edm.model.Multiplo4;
import ar.edu.unju.edm.model.Notas;
import ar.edu.unju.edm.model.ParImpar;
import ar.edu.unju.edm.model.Tiempo;

@SpringBootApplication
public class Tp01WeigertKaren1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp01WeigertKaren1Application.class, args);
		
		Factorial unfactorial = new Factorial();
		unfactorial.setNum1(4);
		if (unfactorial.getNum1()>=0 && unfactorial.getNum1()<=10)
		
			{
			System.out.println("el factorial es: " + unfactorial.resolverFactorial());
			}
		else
		{
			System.out.println("no se puede ingresar valores mayores que 10 ni menores que 1");
		}
		
		AñoBisiesto unañobisiesto = new AñoBisiesto();
		unañobisiesto.setNum1(2010);
		unañobisiesto.resolverBisiesto();
		
		ParImpar unparimpar = new ParImpar();
		unparimpar.setNu1(5);
         unparimpar.resolverparoimpar();	
         
         Meses unmeses = new Meses();
         unmeses.setMes(3);
         unmeses.resolvermes();
         
         Notas unnotas =new Notas();
         unnotas.setNota(7);
         unnotas.resolvernotas();
         
         Multiplo4 unmultiplo4= new Multiplo4();
         unmultiplo4.setCuatro(10);
         unmultiplo4.multiplo4();
         
         BucleFor unfor=new BucleFor();
         unfor.setBucle(12);
         unfor.buclef();
         
         BlucleWhile unwhile = new BlucleWhile();
         unwhile.setBucle(15);
         unwhile.buclew();
         
         BucleDoWhile undowhile =new BucleDoWhile();
         undowhile.setBucle(20);
         undowhile.buclew();
         
         Tiempo untiempo =new Tiempo();
         untiempo.setH(8);
         untiempo.tiempo();
	}

}
