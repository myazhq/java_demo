package test;

import com.my.dao.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestPerson {
    @Before
    public void before(){
        System.out.println("before()方法");
    }
    @Test
    public void testrun(){
        Person person=new Person();
        person.run();
    }
    @Test
    public void testeat(){
        Person person=new Person();
        person.eat();
    }
    @After
    public void  after(){
        System.out.println("after()方法");
    }
}
