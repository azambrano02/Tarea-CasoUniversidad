package model;

import java.util.ArrayList;
import model.Trabajador;
import model.Facultad;

public class Universidad {
	private String nombre;
	private String direccion;
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	private ArrayList<Facultad> facultades = new ArrayList<Facultad>();
	private TipoUniversidad tipoUniversidad;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public TiooUniversidad getTipoUniversidad() {
		throw new UnsupportedOperationException();
	}

	public Universidad(String nombre, String direccion) {
		throw new UnsupportedOperationException();
	}
}