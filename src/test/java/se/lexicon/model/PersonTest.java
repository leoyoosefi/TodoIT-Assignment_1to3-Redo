package se.lexicon.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {


    public Person testObject;

    @BeforeEach
    public void setUp(){
        testObject= new Person("Leo", "Yoosefi","leoyoosefi@gmail.com");
    }

    @Test
    public void testObjectSuccessfullyInstantiated(){

        Assertions.assertEquals("Leo",testObject.getFirstName());
        Assertions.assertEquals("Yoosefi",testObject.getLastName());
        Assertions.assertEquals("leoyoosefi@gmail.com",testObject.getEmail());
    }


    @Test
    public void testFirstName_successful(){
        testObject.setFirstName("Leo");
        Assertions.assertEquals("Leo", testObject.getFirstName());
    }


    @Test
    public void equal_successful(){
        Person expectedResult = new Person("Leo", "Yoosefi", "leoyoosefi@gmail.com");
        Assertions.assertEquals(expectedResult, testObject);
    }

    @Test
    public void hash_successful(){
        Person expectedResult = new Person("Leo", "Yoosefi", "leoyoosefi@gmail.com");
        Assertions.assertEquals(expectedResult.hashCode(), testObject.hashCode());
    }



}
