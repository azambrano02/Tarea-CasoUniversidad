package model;

import java.util.ArrayList;
import java.util.List;

import model.Trabajador;
import model.Facultad;

public class Universidad {
	private String nombre;
	private String direccion;
	private List<Trabajador> trabajadores;
	private List<Facultad> facultades;
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
	public List<Trabajador> getTrabajadores(){
		return this.trabajadores;
	}
	public void setTrabajadores(List<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}
	public List<Facultad> getFacultades(){
		return this.facultades;
	}
	public void setFacultades(List<Facultad> facultades) {
		this.facultades = facultades;
	}

	public TipoUniversidad getTipoUniversidad(){
		return tipoUniversidad;
	}
	public void setTipoUniversidad(TipoUniversidad tipoUniversidad) {
		this.tipoUniversidad = tipoUniversidad;
	}

	public Universidad(String nombre, String direccion, TipoUniversidad tipoUniversidad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.trabajadores = new ArrayList<>();
		this.facultades = new ArrayList<>();
		this.tipoUniversidad = tipoUniversidad;
	}
}