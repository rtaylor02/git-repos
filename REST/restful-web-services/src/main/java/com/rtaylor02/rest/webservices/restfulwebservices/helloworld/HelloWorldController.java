package com.rtaylor02.rest.webservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hello-rod")
    public String helloRod() { return "Hello, ROD!"; }

    @GetMapping(path = "/hello-rod-bean")
    public HelloRodBean helloRodBean() { return new HelloRodBean("Hello Rod!"); }

    @GetMapping(path = "/hello-rod-bean/{otherMessage}")
    public HelloRodBean helloRodBeanWithMessage(@PathVariable String otherMessage) {
        return new HelloRodBean(String.format("Hello Rod! Other message = %s", otherMessage));
    }

//    @GetMapping(path = "/hello-world-internationalized")
//    public String helloInternationalized(@RequestHeader(name="Accept-Language", required=false) Locale locale) {
//        return messageSource.getMessage("messages.good.morning",null, locale); }

    @GetMapping(path = "/hello-world-internationalized")
    public String helloInternationalized() {
        return messageSource.getMessage("messages.good-morning",null, LocaleContextHolder.getLocale()); }
}
