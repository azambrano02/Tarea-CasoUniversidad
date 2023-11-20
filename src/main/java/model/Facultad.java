package model;

import java.util.ArrayList;
import java.util.List;

import model.Departamento;

public class Facultad {
	private String nombre;
	private double latitud;
	private double longitud;
	private Universidad universidad;
	private List<Departamento> departamentos;

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLatitud() {
		return this.latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return this.longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public Universidad getUniversidad(){
		return this.universidad;
	}
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	public List<Departamento> getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public Facultad(String nombre, double latitud, double longitud, Universidad universidad) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.universidad = universidad;
		this.departamentos = new ArrayList<>();
	}
}