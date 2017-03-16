package com.yp.batch;
import com.yp.batch.entity.Person;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.text.SimpleDateFormat;

public class PersonFieldSetMapper implements FieldSetMapper<Person> {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Person mapFieldSet(FieldSet fieldSet) throws BindException {
        Person Person = new Person();
        Person.setFirstName(fieldSet.readString(0));
        Person.setLastName(fieldSet.readString(1));
        return Person;
    }

}