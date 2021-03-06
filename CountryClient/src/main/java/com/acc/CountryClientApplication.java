package com.acc;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class CountryClientApplication {

	public static void main(String[] args) throws DatatypeConfigurationException {
		ConfigurableApplicationContext context =SpringApplication.run(CountryClientApplication.class, args);
	    CountryClient cc = (CountryClient) context.getBean("countryBean");
	    cc.requestCountry();
	}

}
