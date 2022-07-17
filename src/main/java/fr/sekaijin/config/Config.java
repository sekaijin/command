package fr.sekaijin.config;

import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class Config {
	
	protected final Logger log = LoggerFactory.getLogger(getClass());

	public void setOut(String out, String name) {
    	log.info("set {} config {}", out, name);
	}

	public void unsetOut(String out, String name) {
    	log.info("unset {} config {}", out, name);
	}

//	private String name;
//
//	public Config(String name) {
//		this.name=name;
//	}
//
//	@Override
//	public String toString() {
//		return "Config [name=" + name + "]";
//	}

}
