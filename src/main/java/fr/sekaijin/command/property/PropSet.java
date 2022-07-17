package fr.sekaijin.command.property;

import fr.sekaijin.command.AbstractCommand;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "set", mixinStandardHelpOptions = true, description = "set property value", abbreviateSynopsis = true)
public class PropSet extends AbstractCommand {

    @Option(names="-p", required = true, description="Property name. ex:foo.bar.url")
    String name;

    @Option(names="-v", required = true, description="Property value. ex:file:data/out.txt")
    String value;

    @Override
    public void run() {
    	log.info("Property set {}={}", name, value);
    }

}
