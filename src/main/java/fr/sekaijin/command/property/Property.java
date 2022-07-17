package fr.sekaijin.command.property;

import picocli.CommandLine.Command;

@Command(name= "property" ,mixinStandardHelpOptions = true, description = "set, unset, reset property", abbreviateSynopsis = true
, subcommands = {
    PropSet.class,
    PropReset.class,
    PropUnset.class
})
public class Property {
    
}
