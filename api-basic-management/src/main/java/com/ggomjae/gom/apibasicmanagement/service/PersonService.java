package com.ggomjae.gom.apibasicmanagement.service;

import com.ggomjae.gom.apibasicmanagement.QueryDslRepository.PersonRepositoryInterface;
import com.ggomjae.gom.modulequerydsldb.domain.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepositoryInterface personRepositoryInterface;

    public void savePerson(){
        personRepositoryInterface.savePerson(Person.builder()
            .name("ggomjae")
            .age(29)
            .build());
        //Person person = new Person(); //
    }

    @Transactional(readOnly = true)
    public List<Person> retrieveAllPerson(){

        return personRepositoryInterface.retrieveAllPerson();
    }
}
