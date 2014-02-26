package com.myguel.training.service;

import java.sql.SQLException;
import java.util.List;

import com.myguel.training.BusinessException;
import com.myguel.training.domain.Cliente;

public interface ClienteService {

	void save(Cliente t) throws BusinessException, SQLException;
	List<Cliente> find(Cliente t) throws BusinessException, SQLException;
}
