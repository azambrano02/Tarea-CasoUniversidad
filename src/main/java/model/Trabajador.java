package model;

import java.util.Date;

public abstract class Trabajador {
	private String tituloProfesional;
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private String rut;
	private Date horario;
	private Universidad universidad;

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}
	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}
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
	public String getEstadoCivil() {
		return this.estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getRut() {
		return this.rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public Date getHorario() {
		return this.horario;
	}
	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public abstract TipoTrabajador getTipo();

	public Trabajador(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, Date horario) {
		this.tituloProfesional = tituloProfesional;
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.rut = rut;
		this.horario = horario;
	}
}