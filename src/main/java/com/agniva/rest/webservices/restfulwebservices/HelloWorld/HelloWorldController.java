package com.agniva.rest.webservices.restfulwebservices.HelloWorld;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource){
        this.messageSource = messageSource;
    }

    @RequestMapping("/hello-world")
    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping("/hello-world-bean")
    @GetMapping
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @RequestMapping("/hello-world-bean/path-variable/{name}")
    @GetMapping
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(name);
    }

    @RequestMapping("/hello-world-internationalized")
    @GetMapping
    public String helloWorldInternationalized(){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
    }

}
