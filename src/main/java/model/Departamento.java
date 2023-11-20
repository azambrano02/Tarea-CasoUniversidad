package model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nombre;
	private Facultad facultad;
	private List<Profesor> profesores;
	private List<Administrativo> administrativos;
	private List<CarreraUniversitaria> carrerasUniversitarias;

	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultad getFacultad() {
		return facultad;
	}
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	public List<Profesor> getProfesores(){
		return this.profesores;
	}
	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}
	public List<Administrativo> getAdministrativos(){
		return this.administrativos;
	}
	public void setAdministrativos(List<Administrativo> administrativos) {
		this.administrativos = administrativos;
	}
	public List<CarreraUniversitaria> getCarrerasUniversitarias(){
		return this.carrerasUniversitarias;
	}
	public void setCarrerasUniversitarias(List<CarreraUniversitaria> carrerasUniversitarias) {
		this.carrerasUniversitarias = carrerasUniversitarias;
	}

	public Departamento(String nombre, Facultad facultad) {
		this.nombre = nombre;
		this.facultad = facultad;
		this.profesores = new ArrayList<>();
		this.administrativos = new ArrayList<>();
		this.carrerasUniversitarias = new ArrayList<>();
	}
}