package model;

import java.util.ArrayList;
import java.util.List;


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

	public List<Trabajador> obtenerTrabajadores(Universidad universidad) {
		List<Trabajador> trabajadoresUniversidad = new ArrayList<>();
		for (Facultad facultad : universidad.getFacultades()) {
			for (Departamento departamento : facultad.getDepartamentos()) {
				trabajadores.addAll(departamento.getProfesores());
				trabajadores.addAll(departamento.getAdministrativos());
			}
		}
		return trabajadoresUniversidad;
	}
	public List<Administrativo> administrativos(Universidad universidad) {
		List<Trabajador> trabajadores = obtenerTrabajadores(universidad);
		List<Administrativo> administrativos = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador.getTipo().equals(TipoTrabajador.ADMINISTRATIVO)) {
				administrativos.add((Administrativo) trabajador);
			}
		}
		return administrativos;
	}
	public List<Profesor> profesores(Universidad universidad) {
		List<Trabajador> trabajadores = obtenerTrabajadores(universidad);
		List<Profesor> profesores = new ArrayList<>();
		for (Trabajador trabajador : trabajadores) {
			if (trabajador.getTipo().equals(TipoTrabajador.PROFESOR)) {
				profesores.add((Profesor) trabajador);
			}
		}
		return profesores;
	}
}