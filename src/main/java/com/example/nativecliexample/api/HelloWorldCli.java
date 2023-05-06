package com.example.nativecliexample.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

@Slf4j
@Component
@CommandLine.Command(name = "hello", mixinStandardHelpOptions = true)
public class HelloWorldCli implements Runnable {
    @Override
    public void run() {
        log.info("hello cli");
    }
}
