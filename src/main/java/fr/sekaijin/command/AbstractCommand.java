package fr.sekaijin.command;

import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractCommand implements Callable<Integer>  {
	
	protected final Logger log = LoggerFactory.getLogger(getClass());

}
