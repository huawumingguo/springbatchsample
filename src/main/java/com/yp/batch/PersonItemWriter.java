package com.yp.batch;
import com.yp.batch.entity.Person;
import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

public class PersonItemWriter implements ItemWriter<Person>{

    Logger log = Logger.getLogger(PersonItemWriter.class);

    public void write(List<? extends Person> Persons) throws Exception {
        for (Person m : Persons) {
            log.info("write : "+m);
        }
    }
}