package com.training.arcelik.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.arcelik.db.IPersonDao;
import com.training.arcelik.rest.Person;

@Service
public class PersonService {

    @Autowired
    private IPersonDao pd;

    public String processPerson(final Person personParam) {
        System.out.println("Pro : " + personParam);
        return "OK";
    }

    public String addPerson(final Person personParam) {
        System.out.println("Added : " + personParam);
        this.pd.save(personParam);
        return "OK";
    }


    public Person getPerson(final long id) {
        Optional<Person> findByIdLoc = this.pd.findById(id);
        return findByIdLoc.get();
    }

    public List<Person> getAllPersons() {
        Iterable<Person> findAllLoc = this.pd.findAll();
        List<Person> perListLoc = new ArrayList<>();
        for (Person personLoc : findAllLoc) {
            perListLoc.add(personLoc);
        }
        return perListLoc;
    }

    public boolean deletePerson(final long id) {
        this.pd.deleteById(id);
        return true;
    }

    public List<Person> searchPersonByName(final String name) {
        return this.pd.findByName(name);
    }


}

