package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Calculadora;

@Controller
public class calculadoraController {
	
	@Autowired 
	Calculadora nuevaCalculadora;
	
	@GetMapping("/Calculadora")
	public String mostrarCalculadora(){
		return "calculadora";
	}
	
	@GetMapping("/obtenerSuma")
	public ModelAndView calcularSuma(@RequestParam(name="a") double a,@RequestParam(name="b") double b) {
		
		nuevaCalculadora.setA(a);
		nuevaCalculadora.setB(b);
		double resultado=nuevaCalculadora.calcularSuma();
		ModelAndView modelo=new ModelAndView("resultado");
		modelo.addObject("res",resultado);
		return modelo;
	}
	
	@GetMapping("/obtenerResta")
	public ModelAndView calcularResta(@RequestParam(name="a") double a,@RequestParam(name="b") double b) {
		
		nuevaCalculadora.setA(a);
		nuevaCalculadora.setB(b);
		double resultado=nuevaCalculadora.calcularResta();
		ModelAndView modelo=new ModelAndView("resultado");
		modelo.addObject("res",resultado);
		return modelo;
	}
	@GetMapping("/obtenerMultiplicacion")
	public ModelAndView calcularMultiplicacion(@RequestParam(name="a") double a,@RequestParam(name="b") double b) {
		
		nuevaCalculadora.setA(a);
		nuevaCalculadora.setB(b);
		double resultado=nuevaCalculadora.calcularMultiplicacion();
		ModelAndView modelo=new ModelAndView("resultado");
		modelo.addObject("res",resultado);
		return modelo;
	}
	
	@GetMapping("/obtenerDivision")
	public ModelAndView calcularDivision(@RequestParam(name="a") double a,@RequestParam(name="b") double b) {
		ModelAndView modelo=new ModelAndView("resultado");
		if(b==0){
			modelo.addObject("res", "¡ERROR! Division por cero");
			return modelo;
		}
	
		nuevaCalculadora.setA(a);
		nuevaCalculadora.setB(b);
		double resultado=nuevaCalculadora.calcularDivision();
		
		modelo.addObject("res",resultado);
		return modelo;
	}
	
}
