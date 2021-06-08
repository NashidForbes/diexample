package guru.springframework.services.factory;

import guru.springframework.services.*;

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
            case "de":
                helloWorldService = new HelloWorldServiceGermanImpl();
                break;
            case "fr":
                helloWorldService = new HelloWorldServiceFrenchImpl();
                break;
            default: helloWorldService = new HelloWorldServiceEnglishImpl();
        }

        return  helloWorldService;
    }

}
