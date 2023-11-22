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
	public Universidad getUniversidad() {
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

	public List<Profesor> buscarProfesoresNombre(Departamento departamento, String nombre) {
		List<Profesor> profesoresNombre = new ArrayList<>();
		for (Profesor profesor : departamento.getProfesores()) {
			if (profesor.getNombre().equals(nombre)) {
				profesoresNombre.add(profesor);
			}
		}
		return profesoresNombre;
	}
	public List<CarreraUniversitaria> obtenerCarreras(Facultad facultad) {
		List<CarreraUniversitaria> carreras = new ArrayList<>();
		for (Departamento departamento : facultad.getDepartamentos()) {
			carreras.addAll(departamento.getCarrerasUniversitarias());
		}
		return carreras;
	}
	public List<Profesor> profesoresContratados(Departamento departamento, TipoContrato tipoContrato) {
		List<Profesor> profesoresContratados = new ArrayList<>();
		for (Profesor profesor : departamento.getProfesores()) {
			if (profesor.getTipoContrato() == tipoContrato) {
				profesoresContratados.add(profesor);
			}
		}
		return profesoresContratados;
	}


}