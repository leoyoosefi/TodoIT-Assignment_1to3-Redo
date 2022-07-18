package se.lexicon.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TodoItemTaskTest {


    static final Person DEV1 = new Person("Leo", "Yoosefi", "leoyoosefi@gmail.com");
    static final Person DEV2 = new Person("Negar", "Haghighi", "negarhaghighi@gmail.com");
    static final TodoItem TASK1 = new TodoItem("Task1", "test description", LocalDate.parse("2021-08-22"), false, DEV2);
    static TodoItem TASK2 = new TodoItem("Task2", "test description", LocalDate.parse("2021-11-08"), false, DEV1);


    private TodoItemTask testObject;


    @BeforeEach
    public void setUp() {
        testObject = new TodoItemTask(TASK1, DEV1);
    }

    @Test
    public void testObject_successfully_instantiated() {
        assertEquals(TASK1, testObject.getTodoItem());
        assertEquals(DEV1, testObject.getAssignee());

        assertNotEquals(TASK2, testObject.getTodoItem());
    }

}
