package fr.sekaijin.command;

import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "run", mixinStandardHelpOptions = true, description = "run <out name> jobs", abbreviateSynopsis = true)
public class RunCommand extends AbstractCommand {

    @Parameters(paramLabel = "<name>", defaultValue = "copilote",
        description = "Out Name")
    String name;

    @Override
    public void run() {
    	log.info("Run {}, Batch jobs", name);
    }

}
