package com.ggomjae.gom.apibasicmanagement.QueryDslRepository;

import com.ggomjae.gom.modulequerydsldb.domain.Person;

import java.util.List;

public interface PersonRepositoryInterface {
    void savePerson(Person person);
    List<Person> retrieveAllPerson();
}
