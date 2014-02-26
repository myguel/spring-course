package com.myguel.training.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myguel.training.dao.DireccionDAO;

public class DireccionDAOImpl  implements DireccionDAO{
	private static final Logger logger=LoggerFactory.getLogger(DireccionDAOImpl.class);
	private static DireccionDAO direccionDAO=new  DireccionDAOImpl();
	
	public DireccionDAOImpl() {
	
	}
	public static DireccionDAO createInstanceDireccion(){
		logger.info("##################### - --- CREATE INSTANCE IN DIRECCION");
		return direccionDAO;
	}
}
