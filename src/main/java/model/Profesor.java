package model;

import java.util.Date;

public class Profesor extends Trabajador {
	private Departamento departamento;
	private TipoContrato tipoContrato;

	public TipoContrato getTipoContrato() {
		return this.tipoContrato;
	}

	public Profesor(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, Date horario, TipoContrato tipoContrato) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}