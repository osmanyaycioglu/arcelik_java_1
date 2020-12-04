package com.training.arcelik.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.arcelik.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonRest {

    @Autowired
    private PersonService ps;

    @PostMapping("/add")
    public String write(@Validated @RequestBody final Person personParam) {
        personParam.getAddress()
                   .setPerson(personParam);
        List<Phone> phonesLoc = personParam.getPhones();
        for (Phone phoneLoc : phonesLoc) {
            phoneLoc.setPerson(personParam);
        }
        return this.ps.addPerson(personParam);
    }

    @GetMapping("/getall")
    public List<Person> getAll() {
        return this.ps.getAllPersons();
    }

    @GetMapping("/get/{personId}")
    public Person get(@PathVariable("personId") final long personId) {
        return this.ps.getPerson(personId);
    }

    @GetMapping("/search/{name}")
    public List<Person> get(@PathVariable("name") final String name) {
        return this.ps.searchPersonByName(name);
    }

    @DeleteMapping("/delete/{personId}")
    public String delete(@PathVariable("personId") final long personId) {
        this.ps.deletePerson(personId);
        return "OK";
    }
}
