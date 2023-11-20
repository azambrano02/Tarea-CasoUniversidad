package model;

import java.util.ArrayList;
import model.Departamento;

public class Facultad {
	private String nombre;
	private double latitud;
	private double longitud;
	private Universidad universidad;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

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

	public Facultad(String nombre, double latitud, double longitud) {
		throw new UnsupportedOperationException();
	}
}