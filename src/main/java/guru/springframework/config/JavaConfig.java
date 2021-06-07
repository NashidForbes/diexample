package guru.springframework.config;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldServiceSpanishImpl;
import guru.springframework.services.factory.HelloWorldFactoryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class JavaConfig {

    // instantiate the factory service where it gets
    // injected into Spring application context automatically
    // This is the factory bean which is injected!
    @Bean
    HelloWorldFactoryService factoryService(){
        return new HelloWorldFactoryService();
    }

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactoryService factory){
        return factory.createFactoryService("en");
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactoryService factory){
        return factory.createFactoryService("es");
    }
    
}
