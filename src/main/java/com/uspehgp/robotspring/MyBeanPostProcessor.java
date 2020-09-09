package com.uspehgp.robotspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object object, String name) throws BeansException {

		return object;
	}

	@Override
	public Object postProcessBeforeInitialization(Object object, String name) throws BeansException {
		System.out.println(object + " - postProcessBeforeInitialization()");
		return object;
	}

}
