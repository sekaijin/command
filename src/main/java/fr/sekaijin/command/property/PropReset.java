package fr.sekaijin.command.property;

import fr.sekaijin.command.AbstractCommand;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "reset", mixinStandardHelpOptions = true, description = "set default property value", abbreviateSynopsis = true)
public class PropReset extends AbstractCommand {

    @Option(names="-p", required = true, description="Property name. ex:foo.bar.url")
    String name;

    String value ="default value";

    @Override
    public void run() {
    	log.info("Property set {}={}", name, value);
    }

}
