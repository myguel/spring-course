package com.myguel.training.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myguel.training.dao.ClienteDAO;
import com.myguel.training.domain.Cliente;

public class ClienteDAOImpl implements ClienteDAO{

	private static final Logger logger=LoggerFactory.getLogger(ClienteDAOImpl.class);
	@Override
	public void save(Cliente t) throws SQLException {
		logger.info("SAVE IN DAO");
		
	}

	@Override
	public List<Cliente> find(Cliente t) throws SQLException {
		logger.info("FIND IN DAO");
		return null;
	}

}
