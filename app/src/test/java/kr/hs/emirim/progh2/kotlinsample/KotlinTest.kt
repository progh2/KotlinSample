package kr.hs.emirim.progh2.kotlinsample

import org.junit.Assert
import org.junit.Test

class KotlinTest {
    @Test
    fun test1(){
        Assert.assertEquals(4, 1+3)
    }
    @Test
    fun testGetterSetter(){
        val person = Person("john")
        person.age = 20
        Assert.assertEquals(20, person.age)
        Assert.assertEquals("john", person.name)
    }

    @Test
    fun testSetNickName(){
        val person = Person("john")
        person.nickname = "Banana"
        Assert.assertEquals("banana", person.nickname)
    }

    @Test
    fun testUser(){
        val user = User();
        user.nickname = "death note"
        Assert.assertEquals("DEATH NOTE", user.nickname)
    }

    @Test
    fun testUserLazy(){
        val user = User()
        println("not init")
        Assert.assertNotNull(user.httpText)
        println(user.httpText)
    }

    @Test
    fun testUserNameObservable(){
        val user = User()
        user.name = "john"
        user.name = "james"
        user.name = "유명환"
    }

    @Test
    fun testAnimalByMap(){
        val animal = Animal(mutableMapOf(
            "name" to "cat", "age" to 20
        ))
        Assert.assertEquals("cat", animal.name)
        Assert.assertEquals(20, animal.age)
        animal.age = 21
        animal.name = "dog"
        Assert.assertEquals("dog", animal.map["name"])
        Assert.assertEquals(21, animal.map["age"])
    }
    @Test
    fun testFruit(){
        val fruit1 = Fruit("바나나", "바나나는 길다")
        val fruit2 = Fruit("바나나", "바나나는 길다")
        Assert.assertEquals(fruit1, fruit2)
        Assert.assertEquals(fruit1.hashCode(), fruit2.hashCode())
        println(fruit1.toString())
        println(fruit2.toString())
    }
    @Test
    fun testLambda1(){
        println( sum(1, 2) )
        println( 1 + 2 )
        Assert.assertEquals(4, sum(1,3))
        Assert.assertEquals(4, {x:Int, y:Int -> x * y}(2,2) )
        val exp = {x: Int, y:Int -> {z:Int -> (x + y) * z}}
        // exp2 --> {z: Int -> {(3+2) * z }}
        val exp2 = exp(3, 2)
        // result --> (3 + 2) * 4
        val result = exp2(4)
        Assert.assertEquals(20, result)
    }
    @Test
    fun testCollectionApi(){
        val list=listOf(1,"2",3,4,5.7,1,2,123.0)
        //filter
        println(list.filter{ item -> item is Int  })
        println(list.filter { it is Int })
        //map
        println(list.map{"value: ${it}"})
        println(list.filter{it is Int}.map{"value:${it}"})
        println(list.find{ it is Double })

        val map = list.groupBy { it.javaClass }
        println(map)

        val list2 = listOf(listOf(1,2), listOf(3,4))
        println(list2)

        println(list2.map {"value: ${it}"})
        println(list2.flatMap { it.toList() })
    }
    @Test
    fun testExtetions(){
        val str = "Hello, Extensions"
        Assert.assertEquals("s",str.lastString())
    }
}