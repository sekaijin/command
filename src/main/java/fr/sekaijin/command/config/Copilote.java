package fr.sekaijin.command.config;

import fr.sekaijin.command.AbstractCommand;
import picocli.CommandLine.Command;

@Command(name = "copilote", mixinStandardHelpOptions = true, description = "set, unset Copilote", abbreviateSynopsis = true
, subcommands = {
		SetCopilote.class,
		UnsetCopilote.class
})
public class Copilote extends AbstractCommand {

    @Override
    public Integer call() throws Exception {
        log.info("list copilotes");
        return 0;
    }

}
