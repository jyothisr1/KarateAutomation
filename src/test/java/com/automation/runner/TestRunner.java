package com.automation.runner;

import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;

public class TestRunner {

    //karate runner
    @Karate.Test
    Karate testSuite(){
        return Karate.run("classpath:features").outputCucumberJson(true).reportDir("Cucumber-Karate");
    }
    //junit runner
//    @Test
//    public void runSuite(){
////        Karate.run("classpath:features").parallel(2);
//        Karate.run("classpath:features").outputCucumberJson(true);
//    }
}
