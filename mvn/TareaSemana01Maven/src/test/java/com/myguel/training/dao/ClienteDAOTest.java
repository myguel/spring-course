package com.myguel.training.dao;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.myguel.training.CommonsTest;
import com.myguel.training.domain.Cliente;

public class ClienteDAOTest extends CommonsTest {

	@Autowired
	private ClienteDAO clienteDAO;
	@Test
	public void save() throws SQLException{
		Cliente t=new  Cliente();
		clienteDAO.save(t);
	}

}
