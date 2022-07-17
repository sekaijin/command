package fr.sekaijin.command.config;

import fr.sekaijin.command.AbstractCommand;
import picocli.CommandLine.Command;

@Command(name = "prepare", mixinStandardHelpOptions = true, description = "initialize config data base", abbreviateSynopsis = true)
public class Prepare extends AbstractCommand {

    @Override
    public void run() {
    	log.info("initialize config data base");
    }

}
