package com.myguel.training.dao;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myguel.training.dao.impl.CommonDAOImpl;
import com.myguel.training.dao.impl.PersonaDAOImpl;
import com.myguel.training.domain.Cliente;

public class ClienteDAOMain {

	private static ApplicationContext appContext;
	public static void main(String[] args) throws SQLException {
		appContext = new ClassPathXmlApplicationContext(new String[] {"app-dao.xml"});
		ClienteDAO caballero = (ClienteDAO) appContext.getBean("clienteDAO",ClienteDAO.class);
//		String [] alias= appContext.getAliases("app-cliienteDAO");
//		System.out.println(alias[0]);
		Cliente t=new Cliente();
		caballero.save(t);		
//		PersonaDAOImpl daoImpl =(PersonaDAOImpl) appContext.getBean("personaDAO");		
//		daoImpl.createInstance();
		
//		CommonDAOImpl commonDAOImpl=(CommonDAOImpl) appContext.getBean("commonDAO");
//		commonDAOImpl.toString();
	}
}
