package fr.sekaijin.command.config;

import picocli.CommandLine.Command;

@Command(name= "config" ,mixinStandardHelpOptions = true, description = "Batch config commands", abbreviateSynopsis = true
, subcommands = {
		Prepare.class,
		Copilote.class
})
public class Configuration {
    
}
