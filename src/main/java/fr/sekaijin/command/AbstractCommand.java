package fr.sekaijin.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractCommand implements Runnable  {
	
	protected final Logger log = LoggerFactory.getLogger(getClass());

}
