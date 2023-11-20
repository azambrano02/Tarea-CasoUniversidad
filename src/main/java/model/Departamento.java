package model;

import java.util.ArrayList;
import model.Profesor;
import model.Administrativo;
import model.CarreraUniversitaria;

public class Departamento {
	private String nombre;
	private Facultad facultad;
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	private ArrayList<CarreraUniversitaria> carrerasUniversitarias = new ArrayList<CarreraUniversitaria>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento(String nombre) {
		throw new UnsupportedOperationException();
	}
}