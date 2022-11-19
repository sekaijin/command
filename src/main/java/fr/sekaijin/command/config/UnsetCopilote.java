package fr.sekaijin.command.config;

import javax.inject.Inject;

import fr.sekaijin.command.AbstractCommand;
import fr.sekaijin.config.Config;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "unset", mixinStandardHelpOptions = true, description = "unset copilote config", abbreviateSynopsis = true)
public class UnsetCopilote extends AbstractCommand {
	

    @Parameters(paramLabel = "name", 
        description = "copilote Name")
    String name;

    @Inject
    Config config;

    @Override
    public Integer call() {
    	config.unsetOut("copilote", name);
        return 0;
    }

}
