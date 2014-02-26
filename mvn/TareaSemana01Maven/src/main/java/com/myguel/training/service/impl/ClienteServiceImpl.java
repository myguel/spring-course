package com.myguel.training.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myguel.training.BusinessException;
import com.myguel.training.CommonsTest;
import com.myguel.training.dao.ClienteDAO;
import com.myguel.training.dao.impl.ClienteDAOImpl;
import com.myguel.training.domain.Cliente;
import com.myguel.training.service.ClienteService;

public class ClienteServiceImpl implements ClienteService{
	private static final Logger logger=LoggerFactory.getLogger(CommonsTest.class);
	private ClienteDAO clienteDAO;
	
	public ClienteServiceImpl() {
		clienteDAO=new ClienteDAOImpl();
	}
	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	@Override
	public void save(Cliente t) throws BusinessException, SQLException {
		logger.info("SAVE IN SERVICE");
		clienteDAO.save(t);
		
	}

	@Override
	public List<Cliente> find(Cliente t) throws BusinessException, SQLException {
		logger.info("FIND IN SERVICE");
		return clienteDAO.find(t);
	}

}
