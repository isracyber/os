package com.israel.os.domain;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Usuario extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "usuario")
	private List<OS> list = new ArrayList<>();

	public Usuario() {
		super();

	}

	public Usuario(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);

	}

	public List<OS> getList() {
		return list;
	}

	public void setList(List<OS> list) {
		this.list = list;
	}

}
