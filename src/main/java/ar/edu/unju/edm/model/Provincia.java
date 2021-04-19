package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Provincia {
	private String nombre;
	private int codigo;
	public Provincia() {
		// TODO Auto-generated constructor stub
	}
	public Provincia(String nombre, int codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
