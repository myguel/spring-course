package com.myguel.training;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations={"classpath:spring-config.xml"})
//@ContextConfiguration(locations={"classpath:app-dao.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Ignore
public class CommonsTest extends TestCase {
	protected static final Logger logger=LoggerFactory.getLogger(CommonsTest.class);

	@After
	public void begin(){
		logger.info("#####################--- INICIO DE TEST --- ##########################");
	}
	
	@After
	public void end(){
		logger.info("#####################--- FIN DE TEST --- ##########################");
	}
	
	
}
