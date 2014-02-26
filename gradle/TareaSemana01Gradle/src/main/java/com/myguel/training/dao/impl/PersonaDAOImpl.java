package com.myguel.training.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myguel.training.dao.PersonaDAO;

public class PersonaDAOImpl implements PersonaDAO{

	private static final Logger logger=LoggerFactory.getLogger(PersonaDAOImpl.class);
	private static PersonaDAOImpl personaDAO=new  PersonaDAOImpl();
	
	public PersonaDAOImpl() {
	
	}
	public static PersonaDAOImpl createInstance(){
		logger.info("##################### - --- CREATE INSTANCE");
		return personaDAO;
	}
}
