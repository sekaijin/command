package fr.sekaijin.command.config;

import picocli.CommandLine.Command;

@Command(name = "copilote", mixinStandardHelpOptions = true, description = "set, unset Copilote", abbreviateSynopsis = true
, subcommands = {
		SetCopilote.class,
		UnsetCopilote.class
})
public class Copilote {

}
