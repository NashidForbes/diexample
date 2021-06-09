package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 10/26/15.
 */
//@Controller
public class GreetingController {

    private HelloWorldService helloWorldService;

    private HelloWorldService helloWorldServiceGerman;
    
    private HelloWorldService helloWorldServiceFrench;

    // select english based on profile
    // OR
    // select spanish based on profile
    //@Autowired
    public void setHelloWorldService(
            HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    //@Autowired
    //@Qualifier("french")
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

    // select the German implementation in java config based on
    // method name
    //@Autowired
    //@Qualifier("helloWorldServiceGerman")
    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }


    public String sayHello() {
        String greeting = helloWorldService.getGreeting();

        System.out.println(greeting);
        System.out.println(helloWorldServiceGerman.getGreeting());
        System.out.println(helloWorldServiceFrench.getGreeting());
        return greeting;
    }

}
