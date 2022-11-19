package fr.sekaijin.command.property;

import fr.sekaijin.command.AbstractCommand;
import picocli.CommandLine.Command;

@Command(name= "property" ,mixinStandardHelpOptions = true, description = "set, unset, reset property", abbreviateSynopsis = true
, subcommands = {
    PropSet.class,
    PropUnset.class
})
public class Property extends AbstractCommand {

    @Override
    public Integer call() throws Exception {
        log.info("list properties");
         System.out.println(Util.list());
        return 0;
    }
    
}
