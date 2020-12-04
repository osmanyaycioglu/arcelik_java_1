package com.training.arcelik.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/per")
public class PersonPlayground {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/hello2/{abc}/{xyz}")
    public String hello2(@PathVariable("abc") final String name,
                         @PathVariable("xyz") final String surname) {
        return "hello 2 : " + name + " " + surname;
    }

    @GetMapping("/hello3")
    public String hello3(@RequestParam("abc") final String name,
                         @RequestParam("xyz") final String surname) {
        return "hello 3 : " + name + " " + surname;
    }

    @GetMapping("/hello4/{abc}")
    public String hello4(@PathVariable("abc") final String name,
                         @RequestParam("xyz") final String surname) {
        return "hello 4 : " + name + " " + surname;
    }

    @GetMapping("/hello5")
    public String hello5(@RequestHeader("abc") final String name,
                         @RequestHeader("xyz") final String surname) {
        return "hello 5 : " + name + " " + surname;
    }

    @PostMapping("/hello6")
    public String hello6(@RequestBody final Person person) {
        return "hello 6 : " + person;
    }

    @PostMapping("/hello7")
    public Person hello7(@RequestBody final Person person) {
        person.setAge(99);
        return person;
    }

    @PostMapping(value = "/hello8",
                 consumes = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 },
                 produces = {
                              MediaType.APPLICATION_JSON_VALUE,
                              MediaType.APPLICATION_XML_VALUE
                 })
    public Person hello8(@RequestBody final Person person) {
        person.setAge(99);
        return person;
    }

}
