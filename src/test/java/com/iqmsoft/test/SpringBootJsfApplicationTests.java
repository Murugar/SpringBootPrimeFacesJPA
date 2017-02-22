package com.iqmsoft.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.iqmsoft.boot.service.QuestionService;
import com.iqmsoft.jsf.boot.SpringBootPrimeFacesApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootPrimeFacesApplication.class)
@WebAppConfiguration
public class SpringBootJsfApplicationTests {

	@Autowired
	private QuestionService questionService;
	
	@Test
	public void contextLoads() {
		
	}

}
