package com.myguel.training.dao.impl;

import java.beans.ConstructorProperties;

public class CommonDAOImpl {

	private Integer years;
	private String ultimateAnswer;
	@ConstructorProperties({"years","ultimateAnswer"})
	public CommonDAOImpl(Integer years, String ultimateAnswer) {
		super();
		this.years = years;
		this.ultimateAnswer = ultimateAnswer;
	}
	
}
