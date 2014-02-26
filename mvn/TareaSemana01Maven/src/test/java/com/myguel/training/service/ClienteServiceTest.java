package com.myguel.training.service;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.myguel.training.BusinessException;
import com.myguel.training.CommonsTest;
import com.myguel.training.dao.ClienteDAO;
import com.myguel.training.dao.impl.ClienteDAOImpl;
import com.myguel.training.domain.Cliente;
import com.myguel.training.service.impl.ClienteServiceImpl;

public class ClienteServiceTest extends CommonsTest{
//	@Autowired
	private ClienteService clienteService;
	public ClienteServiceTest() {
		clienteService=new ClienteServiceImpl();
		
	}
	

	@Test
	public void save(){
//		clienteService=new ClienteServiceImpl();
		try {
			Cliente t=new Cliente();
//			t.setDireccion("LIMA");
			t.setNombre("MIGUEL");
			clienteService.save(t);
		} catch (BusinessException e) {
			logger.info(e.getMessage());
		} catch (SQLException e) {
			logger.info(e.getMessage());
		}
	}

}
