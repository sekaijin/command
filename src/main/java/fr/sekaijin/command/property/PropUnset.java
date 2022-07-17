package fr.sekaijin.command.property;

import fr.sekaijin.command.AbstractCommand;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "unset", mixinStandardHelpOptions = true, description = "unset property", abbreviateSynopsis = true)
public class PropUnset extends AbstractCommand {

    @Option(names="-p", required = true, description="Property name. ex:foo.bar.url")
    String name;

    @Override
    public void run() {
        log.info("Property unset {}", name);
    }
}
