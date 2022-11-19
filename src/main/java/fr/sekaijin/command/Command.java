package fr.sekaijin.command;

import javax.inject.Inject;

import fr.sekaijin.command.config.Copilote;
import fr.sekaijin.command.config.Prepare;
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
    Prepare.class,
    Copilote.class},
    versionProvider = PropertiesVersionProvider.class)
public class Command //extends AbstractCommand 
implements QuarkusApplication{
    @Inject
    CommandLine.IFactory factory;

    @Override
    public int run(String... args) throws Exception {
        if (args.length == 0){
            return new CommandLine(this, factory).execute("run", "default");
        } else {
            return new CommandLine(this, factory).execute(args);
        }
    }

    // @Override
    // public Integer call() throws Exception {
    //     log.info("defaul command");

    //     return 0;
    
    // }

    
    
}
