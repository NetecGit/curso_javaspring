package com.netec.training.cfe.dto;

import java.io.Serializable;

public class ClientDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long idClient;
	private String name;
	private String surname;

	public ClientDTO() {
	}

	public ClientDTO(final long id, final String name, final String surname) {
		super();
		idClient = id;
		this.name = name;
		this.surname = surname;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(final long idClient) {
		this.idClient = idClient;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

}