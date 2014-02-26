package com.myguel.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.myguel.training.domain.Cliente;

public interface ClienteDAO {
	void save(Cliente t) throws  SQLException;
	List<Cliente> find(Cliente t) throws  SQLException;
}
