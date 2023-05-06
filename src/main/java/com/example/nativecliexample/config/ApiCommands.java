package com.example.nativecliexample.config;

import com.example.nativecliexample.api.HelloWorldCli;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

@Component
@CommandLine.Command(name = "api", mixinStandardHelpOptions = true,
        description = "spring native hello world example",
        version = "0.0.1", subcommands = {
        HelloWorldCli.class
})
public class ApiCommands {
}
