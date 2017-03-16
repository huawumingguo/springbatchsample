package com.yp.batch;
import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

import com.yp.batch.entity.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    Logger log = Logger.getLogger(PersonItemProcessor.class);

    public Person process(Person person) throws Exception {
        person.setFirstName(person.getFirstName().toUpperCase());
        person.setLastName(person.getLastName().toUpperCase());
        return person;
    }

}