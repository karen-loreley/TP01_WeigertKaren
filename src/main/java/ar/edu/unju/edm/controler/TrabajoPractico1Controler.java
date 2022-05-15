package ar.edu.unju.edm.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

@Controller
public class TrabajoPractico1Controler {
	
@GetMapping("/menu")	
	public String mostrarFactorial() {
		return "index";
	}

@GetMapping("/factorial")

	public String getFactorial(@RequestParam (name = "num1")int num1, Model model) {
	int resultado1 = 0;
	Factorial nuevofactorial = new Factorial();
	nuevofactorial.setNum1(num1);
	resultado1 = nuevofactorial.resolverFactorial();
	model.addAttribute("resultado1", resultado1);
		
		return "punto1";
	}

@GetMapping("/ano")

public String getAñobisiesto(@RequestParam (name = "num1")int num1, Model model) {
String resultado2 = "";
AñoBisiesto nuevoañobisiesto =new AñoBisiesto();
nuevoañobisiesto.setNum1(num1);
resultado2 = nuevoañobisiesto.resolverBisiesto();
model.addAttribute("resultado2", resultado2);
	
	return "punto2";
}
@GetMapping("/par")

public String getParImpar(@RequestParam (name = "num1")int num1, Model model) {
String resultado3 = "";
ParImpar nuevoparimpar = new ParImpar();
nuevoparimpar.setNu1(num1);
resultado3 = nuevoparimpar.resolverparoimpar();
model.addAttribute("resultado3", resultado3);
	
	return "punto3";
}

@GetMapping("/mes")

public String getMeses(@RequestParam (name = "num1")int num1, Model model) {
String resultado4 = "";
Meses nuevomeses = new Meses();
nuevomeses.setMes(num1);
resultado4 = nuevomeses.resolvermes();
model.addAttribute("resultado4", resultado4);
	
	return "punto4";
}


@GetMapping("/notas")

public String getNotas(@RequestParam (name = "num1")int num1, Model model) {
String resultado5 = "";
Notas nuevonotas = new Notas();
nuevonotas.setNota(num1);
resultado5 = nuevonotas.resolvernotas();
model.addAttribute("resultado5", resultado5);
	
	return "punto6";
}

@Autowired
Multiplo4 multiplo;
@GetMapping("/multiplo")
public String getMultiplo4(@RequestParam (name = "num1")int num1, Model model) {
String aux;
Multiplo4 multiplo = new Multiplo4();
multiplo.setCuatro(num1);
aux =multiplo.multiplo4();
model.addAttribute("secue", aux);
	
	return "punto8";
}

@GetMapping("/bfor")
public String getBucleFor(@RequestParam (name = "num1")int num1, Model model) {
String aux;
BucleFor bfor = new BucleFor();
bfor.setBucle(num1);
aux =bfor.buclef();
model.addAttribute("buclef", aux);
	
	return "punto9";
}

@GetMapping("/bwhile")
public String getBlucleWhile(@RequestParam (name = "num1")int num1, Model model) {
String aux;
BlucleWhile bwhile = new BlucleWhile();
bwhile.setBucle(num1);
aux =bwhile.buclew();
model.addAttribute("buclew", aux);
	
	return "punto10";
}

@GetMapping("/bdowhile")
public String getBucleDoWhile(@RequestParam (name = "num1")int num1, Model model) {
String aux;
BucleDoWhile bdowhile = new BucleDoWhile();
bdowhile.setBucle(num1);
aux =bdowhile.buclew();
model.addAttribute("bucledow", aux);
	
	return "punto11";
}


@GetMapping("/tiempo")

public String getTiempo(@RequestParam (name = "num1")int num1, Model model) {
double resultado12 = 0.00;
Tiempo nuevotiempo =new Tiempo();
nuevotiempo.setH(num1);
resultado12 = nuevotiempo.tiempo();
model.addAttribute("resultado12", resultado12);
	
	return "punto12";
}

}

