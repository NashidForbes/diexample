package guru.springframework.services.factory;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldServiceSpanishImpl;

public class HelloWorldFactoryService {

    public HelloWorldService createFactoryService(String language) {
        HelloWorldService helloWorldService = null;
        switch (language) {
            case "en":
                helloWorldService = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                helloWorldService = new HelloWorldServiceSpanishImpl();
                break;
            default: new HelloWorldServiceEnglishImpl();
        }

        return  helloWorldService;
    }

}
