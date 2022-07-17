package fr.sekaijin.command;

import javax.inject.Inject;

import fr.sekaijin.command.config.Configuration;
import fr.sekaijin.command.property.Property;
import io.quarkus.picocli.runtime.annotations.TopCommand;
import io.quarkus.runtime.annotations.QuarkusMain;

import io.quarkus.runtime.QuarkusApplication;
import picocli.CommandLine;

@TopCommand
@QuarkusMain
@CommandLine.Command(mixinStandardHelpOptions = true, abbreviateSynopsis = true, name="ng447"
, subcommands = {
    RunCommand.class,
    Property.class,
    Configuration.class})
public class Command implements QuarkusApplication {
    @Inject
    CommandLine.IFactory factory;

    @Override
    public int run(String... args) throws Exception {
        return new CommandLine(this, factory).execute(args);
    }
    
}
