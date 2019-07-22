package kr.hs.emirim.progh2.kotlinsample;

import org.junit.Assert;
import org.junit.Test;

public class JavaTest {

    @Test
    public void test1(){

        Assert.assertEquals(4, 1+3);
    }

    @Test
    public void testGetterSetter(){
        PersonJava personJava = new PersonJava("john");
        personJava.setAge(20);
        Assert.assertEquals(20,personJava.getAge());
        Assert.assertEquals("john",personJava.getName());

        Person personKotlin = new Person("john");
        personKotlin.setAge(20);
        Assert.assertEquals(20,personKotlin.getAge());
        Assert.assertEquals("john",personKotlin.getName());

    }

}
