package com.myguel.training.service;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myguel.training.BusinessException;
import com.myguel.training.domain.Cliente;

public class ClienteServiceMain {


	private static ApplicationContext appContext;
	public static void main(String[] args) throws BusinessException, SQLException {
		appContext = new ClassPathXmlApplicationContext(new String[] {"app-service.xml"});
		ClienteService clienteService = (ClienteService) appContext.getBean("clienteService",ClienteService.class);
		Cliente t=new Cliente();
		clienteService.save(t);		
	}
}
