package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		/**
		 * ClassPathXmlApplicationContext is a Spring class that loads the Spring
		 * context from an XML configuration file (beans.xml in this case).
		 * 
		 * try-with-resources statement ensures that the context is closed properly
		 * after use. The context is responsible for managing the beans (objects)
		 * defined in the XML configuration.
		 ***/

		try (var context = new ClassPathXmlApplicationContext("beans.xml")) {

		}

		// Explaining beans.xml

		/**
		 * <?xml version="1.0" encoding="UTF-8"?>
		 * <beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi=
		 * "http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation=
		 * "http://www.springframework.org/schema/beans
		 * http://www.springframework.org/schema/beans/spring-beans.xsd">
		 * 
		 * <bean id="cc" class="com.spring.Implementation.Creditcard"></bean>
		 * <bean id="dc" class="com.spring.Implementation.Debitcard"></bean>
		 * <bean id="upi" class="com.spring.Implementation.UPI"></bean>
		 * <bean id="billcollector" class="com.spring.service.BillService"></bean>
		 * </beans>
		 * 
		 **/

		/**
		 * This XML file is a Spring configuration file that defines the beans (objects)
		 * that Spring will manage.
		 * 
		 * # Each '<bean>' element defines a bean that Spring will create and manage $ id
		 * is the identifier used to reference the bean. $ class specifies the fully
		 * qualified class name of the bean.
		 * 
		 * # In this example, you have defined four beans 
		 * cc: An instance of Creditcard.
		 * 
		 * dc: An instance of Debitcard (assuming it exists in your code but not shown
		 * here).
		 * 
		 * upi: An instance of UPI (assuming it exists in your code but not shown here).
		 * 
		 * billcollector: An instance of BillService.
		 * 
		 **/
	}

}
