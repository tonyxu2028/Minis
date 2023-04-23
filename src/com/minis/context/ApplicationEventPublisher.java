package com.minis.context;


/**
 * @author naixixu
 */
public interface ApplicationEventPublisher {
	void publishEvent(ApplicationEvent event);

	void addApplicationListener(ApplicationListener<?> bean);
}
