package com.training.arcelik.db;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.training.arcelik.rest.Person;

public interface IPersonDao extends CrudRepository<Person, Long> {

    List<Person> findByName(String name);

    List<Person> findByNameAndSurnameOrderByName(String name,
                                                 String surname);

    List<Person> findByNameIn(List<String> name);

    @Query("select p from Person p where p.name=:isim")
    List<Person> searchName(@Param("isim") String name);

    @Query(value = "select * from person p where p.name=:isim", nativeQuery = true)
    List<Person> searchNameNative(@Param("isim") String name);

}
