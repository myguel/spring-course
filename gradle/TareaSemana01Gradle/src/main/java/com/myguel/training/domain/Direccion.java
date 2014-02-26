package com.myguel.training.domain;

import java.io.Serializable;

public class Direccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer direccionId;
	private String nombre;

	public Integer getDireccionId() {
		return direccionId;
	}

	public void setDireccionId(Integer direccionId) {
		this.direccionId = direccionId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
