package fr.sekaijin.command.config;

import javax.inject.Inject;

import fr.sekaijin.command.AbstractCommand;
import fr.sekaijin.config.Config;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "set", mixinStandardHelpOptions = true, description = "set copilote config", abbreviateSynopsis = true)
public class SetCopilote extends AbstractCommand {
	

    @Parameters(paramLabel = "name", 
        description = "copilote Name")
    String name;

    @Inject
    Config config;

    @Override
    public Integer call() {
    	config.setOut("copilote", name);
        return 0;
    }

}
