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

    @Test
    public void testSetNickname(){
        PersonJava personJava = new PersonJava("john");
        personJava.setNickname("Apple");
        Assert.assertEquals("apple", personJava.getNickname());

        Person person = new Person("john");
        person.setNickname("Apple");
        Assert.assertEquals("apple", person.getNickname());
    }

    @Test
    public void testSingletonJava(){
        SingletonJava singletonJava = SingletonJava.getInstance();
        singletonJava.log("싱글톤 패턴을 쓸 수 있어요~");
    }
    @Test
    public void testFruit(){
        FruitJava fruitJava = new FruitJava();
        fruitJava.fruitName = "사과";
        fruitJava.description = "사과는 맛있다";
        System.out.println(fruitJava);

    }

    @Test
    public void testFruitEquals(){
        FruitJava fruitJava1 = new FruitJava();
        FruitJava fruitJava2 = new FruitJava();
        fruitJava1.fruitName = "바나나";
        fruitJava2.fruitName = "바나나";
        fruitJava1.description = "바나나는 길다";
        fruitJava2.description = "바나나는 길다";
        Assert.assertEquals(fruitJava1, fruitJava2);
        Assert.assertEquals(fruitJava1.hashCode(), fruitJava2.hashCode());
    }
}
