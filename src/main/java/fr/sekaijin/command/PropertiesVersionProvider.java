package fr.sekaijin.command;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import picocli.CommandLine.IVersionProvider;

public class PropertiesVersionProvider implements IVersionProvider {

    public PropertiesVersionProvider() {
        super();
    }

    public String[] getVersion() throws Exception {
        return new String[] {
            "version: 1.0.0",
            "build: 15/11/2022",
            "©: Sekaijin"
        };
    }
}