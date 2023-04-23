package com.minis.context;

/**
 * @author naixixu
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{

	private static final long serialVersionUID = 1L;

	public ContextRefreshedEvent(ApplicationContext source) {
		super(source);
	}

	@Override
	public String toString() {
		return this.msg;
	}

}
