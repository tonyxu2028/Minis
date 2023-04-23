package com.minis.beans.factory;

/**
 * @author naixixu
 */
public interface FactoryBean<T> {
	T getObject() throws Exception;

	Class<?> getObjectType();

	default boolean isSingleton() {
		return true;
	}

}
