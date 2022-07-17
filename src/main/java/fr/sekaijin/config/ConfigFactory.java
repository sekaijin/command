//package fr.sekaijin.config;
//
//import javax.enterprise.context.ApplicationScoped;
//import javax.enterprise.inject.Produces;
//
//import picocli.CommandLine;
//
//@ApplicationScoped
//public class ConfigFactory {
//	
//	@Produces
//    @ApplicationScoped 
//    Config getConfig(CommandLine.ParseResult parseResult) {
//		
//		return new Config(parseResult.asCommandLineList().get(3).getCommandSpec().positionalParameters().get(0).getValue().toString());
//	}
//}
